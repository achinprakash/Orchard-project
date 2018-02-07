package com.mindtree.ferrari.controller;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.mindtree.ferrari.dto.FacebookMembersDto;
import com.mindtree.ferrari.entity.MembersTable;
import com.mindtree.ferrari.service.AddSocialMembersService;

@EnableWebMvc
@RestController
@CrossOrigin(origins = "*")
public class SocialLoginController {
	@Autowired
	AddSocialMembersService asms;

	@RequestMapping(value = "/facebookmembers", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public boolean addSocialMembers(@RequestBody FacebookMembersDto facebookMember) {
		MembersTable member = new MembersTable();
		member.setEmail(facebookMember.getEmail());
		member.setFirstName(facebookMember.getFirstName());
		return asms.checkDuplicacy(member);
	}

	@RequestMapping(value = "/googlemembers", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public boolean checkSocialMembers(@RequestBody Map<String, String> idToken1)
			throws GeneralSecurityException, IOException {
		return asms.validatingSocialMembers(idToken1.get("idToken"));
	}

}
