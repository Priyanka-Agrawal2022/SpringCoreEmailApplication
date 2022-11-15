package com.programming.techie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmailApplication {

	public static void main(String[] args) {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		EmailClient emailClient = applicationContext.getBean("emailClient", EmailClient.class);
		
		
//		//Loosely coupled
// 		EmailClient emailClient = new EmailClient(new BasicSpellChecker());
//		EmailClient emailClient = new EmailClient(new AdvancedSpellChecker());
//	
		emailClient.sendEmail("This is my first email message.");
		emailClient.sendEmail("This is my second email message.");
		
		//Bean Scope
		AdvancedSpellChecker advancedSpellChecker = applicationContext.getBean("advancedSpellChecker", AdvancedSpellChecker.class);
		System.out.println(advancedSpellChecker);
		AdvancedSpellChecker advancedSpellChecker1 = applicationContext.getBean("advancedSpellChecker", AdvancedSpellChecker.class);
		System.out.println(advancedSpellChecker1);
	}
}