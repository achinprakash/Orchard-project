package com.mindtree.ferrari.dao.impl;

import com.mindtree.ferrari.dao.EmailDAO;

import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class EmailDAOImpl implements EmailDAO 
{

	@Autowired
	 private SessionFactory sessionFactory;
	 
	 public void setSessionFactory(SessionFactory sf)
	 {
		  this.sessionFactory = sf;
		 }
	
	
	@Override
	public void email(String string,String string2)
	{
		final String username = "vvnskpsp@gmail.com";
		final String password = "saikrishna123";
System.out.println("hi this is dao impl");
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {
//			
            System.out.println("the mail is"+string);
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("vvnskpsp@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
			InternetAddress.parse(string));
			message.setSubject("Congratulations on winning FERRARI Lottery");
			message.setText("Hi, "+string2+" this is from ferrari team you have been selected in the lottery conducted today and the further details will be contacted soon");

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
		
		
		
	}



}
