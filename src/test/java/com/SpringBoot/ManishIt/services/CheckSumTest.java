package com.SpringBoot.ManishIt.services;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import org.mockito.Mock;



class CheckSumTest {
	
	

	@Test
	void test() {
		
		CheckSum s= new CheckSum();
		int a=3;
		int b=4;
		
		int actualR=s.sum(a, b);
		int expected=a+b;
		
		assertEquals(expected, actualR);
		
	}
	
	

}
