package meuPrimeiroProgramaJava;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Projeto1Test {

	@Test
	void test() {
		int[] a = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};
		
		Arrays.sort(a);
		System.out.println("Minimum = " + a[0]);
		System.out.println("Maximum = " + a[a.length-1]);
		
	    int sum = 0;
	    for( int num : a) {
	          sum = sum+num;
	      }
	        
	}

}
