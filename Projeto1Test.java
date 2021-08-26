package meuPrimeiroProgramaJava;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Projeto1Test {

	@Test
	void test() {
		int[] a = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};
		
		Arrays.sort(a);
		
		// Testa o menor
		System.out.println("O menor valor é " +a[0]);
		
		// Testa o maior
		System.out.println("O maior valor é " +a[a.length-1]);
		
		// Testa a soma
	    int soma = 0;
	    for( int num : a) {
	          soma = soma+num;
	      }
	    System.out.println("A soma é " +soma);
	        
	}

}
