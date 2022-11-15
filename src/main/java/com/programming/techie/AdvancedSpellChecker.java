package com.programming.techie;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class AdvancedSpellChecker implements SpellChecker {
	public void checkSpelling(String emailmessage) {
		if(emailmessage != null) {
			//Determine language of email message
			//Check grammatical errors in the email message
			//Check spellings in the email message
			
			System.out.println("Spell checking completed!");
		}
		else {
			throw new RuntimeException("An exception occurred while checking spelling!");
		}
	}
}