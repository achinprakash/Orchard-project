package com.mindtree.ferrari.serviceImpl;
//
//import java.io.IOException;
//import java.security.GeneralSecurityException;
//import java.util.Collections;
//
//import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
//import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken.Payload;
//import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
//import com.google.api.client.http.javanet.NetHttpTransport;
//import com.google.api.client.json.jackson2.JacksonFactory;
//import com.mindtree.ferrari.entity.Members_Table;

public class SocialLoginCheckServiceImpl {
/*	public boolean validatingSocialMembers(String idTokenString) throws GeneralSecurityException, IOException {
		GoogleIdTokenVerifier verifier = new GoogleIdTokenVerifier.Builder(new NetHttpTransport(), new JacksonFactory())
			    .setAudience(Collections.singletonList("805987514852-132gmfltvefh5cmh8a99mam4ttcp1l87.apps.googleusercontent.com"))
			    .build();
		
		GoogleIdToken idToken = verifier.verify(idTokenString);
		if (idToken != null) {
		  Payload payload = idToken.getPayload();

		  
		  Members_Table member = new Members_Table();
		  member.setEmail((String) payload.get("name"));
		  member.setFirstName((String) payload.get("given_name"));
		  member.setLastName((String) payload.get("family_name"));
		  
		  AddSocialMembersServiceImpl asmsi = new AddSocialMembersServiceImpl();
		  return asmsi.checkDuplicacy(member);
		  

		} else {
		  return false;
		}
	}*/

}
