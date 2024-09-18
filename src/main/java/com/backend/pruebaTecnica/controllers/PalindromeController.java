package com.backend.pruebaTecnica.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.pruebaTecnica.models.PalindromeBody;
import com.backend.pruebaTecnica.services.PalindromeService;

@RestController
public class PalindromeController {

	PalindromeService palindromeService = new PalindromeService();
	
	@GetMapping("/isPalindromo")
	@ResponseBody
	public ResponseEntity<PalindromeBody> isPalindromoWord(@RequestBody PalindromeBody body) {
		return ResponseEntity.ok(palindromeService.getResultPalindrome(body.getPalindrome()));
	}
	
	
}
