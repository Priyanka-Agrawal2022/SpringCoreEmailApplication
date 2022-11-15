package com.programming.techie;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BasicSpellChecker implements SpellChecker {
	public void checkSpelling(String emailMessage) {
		if(emailMessage != null) {
			System.out.println("Checking spelling...");
			System.out.println("Spell checking completed!");
		}
		else {
			throw new RuntimeException("An exception occurred while checking spelling!");
		}
	}
}