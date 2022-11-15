package com.programming.techie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmailClient {
//	private BasicSpellChecker basicSpellChecker;
//	private AdvancedSpellChecker advancedSpellChecker;
	
	//Field Injection - avoid this
//	@Autowired
//	@Qualifier("advancedSpellChecker")
	private SpellChecker spellChecker;
	
	//Tight Coupling
//	public EmailClient() {
//		this.basicSpellChecker = new BasicSpellChecker();
//		this.advancedSpellChecker = new AdvancedSpellChecker();
//	}
	
	//Loose Coupling
	
	//Constructor Injection
	@Autowired
	public EmailClient(@Qualifier("advancedSpellChecker")SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	
	//Setter Injection
	public EmailClient() {
		
	}
	
//	public SpellChecker getSpellChecker() {
//		return spellChecker;
//	}
//	
//	@Autowired
//	public void setSpellChecker(@Qualifier("advancedSpellChecker")SpellChecker spellChecker) {
//		this.spellChecker = spellChecker;
//	}
//
	public void sendEmail(String emailMessage) {
		spellChecker.checkSpelling(emailMessage);
		
		//Logic to send email
	}
}