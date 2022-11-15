package com.programming.techie;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.programming.techie")
public class AppConfig {
	
	
//	//Without Component Scan
	
//	@Bean(name="basicSpellChecker")
//	public BasicSpellChecker createBasicSpellChecker() {
//		return new BasicSpellChecker();
//	}
//	
//	@Bean(name="advancedSpellChecker")
//	public AdvancedSpellChecker createAdvancedSpellChecker() {
//		return new AdvancedSpellChecker();
//	}
//	
//	@Bean(name="emailClient")
//	public EmailClient createEmailClient() {
//		EmailClient emailClient = new EmailClient();
//		emailClient.setSpellChecker(createAdvancedSpellChecker());
//		return emailClient;
//	}
}
