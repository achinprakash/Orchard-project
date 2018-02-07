package com.mindtree.ferrari.service.impl;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken.Payload;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.mindtree.ferrari.dao.SocialLoginDao;
import com.mindtree.ferrari.entity.MembersTable;
import com.mindtree.ferrari.service.AddSocialMembersService;

@Service
public class AddSocialMembersServiceImpl implements AddSocialMembersService {

	@Autowired
	SocialLoginDao socialLoginDao; 


	public boolean checkDuplicacy(MembersTable member) {
		String email = member.getEmail();
		if (socialLoginDao.checkExistingData(email)) {
			return true;
		} else {
			return socialLoginDao.addMember(member);

		}
	}

	public boolean validatingSocialMembers(String idTokenString) throws GeneralSecurityException, IOException {
		GoogleIdTokenVerifier verifier = new GoogleIdTokenVerifier.Builder(new NetHttpTransport(), new JacksonFactory())
				.setAudience(Collections
						.singletonList("805987514852-132gmfltvefh5cmh8a99mam4ttcp1l87.apps.googleusercontent.com"))
				.build();

		GoogleIdToken idToken = verifier.verify(idTokenString);
		if (idToken != null) {
			Payload payload = idToken.getPayload();

			MembersTable member = new MembersTable();
			member.setEmail((String) payload.get("name"));
			member.setFirstName((String) payload.get("given_name"));
			member.setLastName((String) payload.get("family_name"));

			return checkDuplicacy(member);

		} else {
			return false;
		}
	}

}
