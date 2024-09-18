package com.backend.pruebaTecnica.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.backend.pruebaTecnica.models.PalindromeBody;

public class PalindromeService {
	
	private final String regexCharactersSpeciales = "\\W";
	
	public Boolean isPalindromo(String word) {
		
		ArrayList<String> lista = new ArrayList<String>();
		word = word.toLowerCase().replaceAll(regexCharactersSpeciales, "");
		
		for (String element : word.split("")) {
			lista.add(0, element);
		}
		String wordPalindroma = lista.stream().reduce("", (acc, curr) -> acc + curr);
		return wordPalindroma.equals(word);
	}
	
	public Integer lengthCadena(String word) {
		return word.length();
	}
	
	public Integer lengthCaracteresEspeciales(String word) {
		Pattern pattern = Pattern.compile(regexCharactersSpeciales);
		Matcher matcher = pattern.matcher(word);
		return 0;
	}
	
	public PalindromeBody getResultPalindrome(String word) {
		String isPalindromo = isPalindromo(word) ? "Is Palindrome" : "Is Not Palindrome"; 
		Integer length = lengthCadena(word);
		Integer lengthCaracteres = lengthCaracteresEspeciales(word);
		return new PalindromeBody(isPalindromo, lengthCaracteres, length);
	}
}
