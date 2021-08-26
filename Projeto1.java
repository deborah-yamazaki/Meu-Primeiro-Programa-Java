/**
 * 
 */
package meuPrimeiroProgramaJava;

import java.util.Arrays;

/**
 * @author Seance
 *
 */
public class Projeto1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};
		
		Arrays.sort(a);
		System.out.println("Minimum = " + a[0]);
		System.out.println("Maximum = " + a[a.length-1]);
		
	     int sum = 0;
	     for( int num : a) {
	          sum = sum+num;
	      }
		
		// TODO Auto-generated method stub

	}

}
