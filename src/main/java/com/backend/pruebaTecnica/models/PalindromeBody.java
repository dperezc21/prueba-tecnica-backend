package com.backend.pruebaTecnica.models;

public class PalindromeBody {
	private String palindrome;
	private String isPalindrome;
	private Integer lengthCaracteresEspeciales;
	private Integer lengthCadena;
	
	public PalindromeBody() {}
	
	public PalindromeBody(String isPalindrome, Integer lengthCaracteresEspeciales, Integer lengthCadena) {
		this.isPalindrome = isPalindrome;
		this.lengthCaracteresEspeciales = lengthCaracteresEspeciales;
		this.lengthCadena = lengthCadena;
	}

	public String getPalindrome() {
		return palindrome;
	}
	
	public void setPalindrome(String palindrome) {
		this.palindrome = palindrome;
	}
	
	public String getIsPalindrome() {
		return isPalindrome;
	}
	
	public int getLengthCadena() {
		return lengthCadena;
	}
	
	public int getLengthCaracteresEspeciales() {
		return lengthCaracteresEspeciales;
	}
}
