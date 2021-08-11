/*Meu Primeiro Programa Java*

Este programa mostra
1) Que um programa é construído dentro de um projeto.
2) Todo programa deve ter uma classe com um método main.
3) Como exibir informações no terminal (console).
4) Como ler uma string do terminal(console).

 */
package meuPrimeiroProgramaJava;

import java.util.Scanner;

/**
 * @author Seance
 * Data: 11/08/2021
 */
public class Principal { // Classe que contém o método principal.
	public static void main(String[] args) { // Este é o método principal.
		
		System.out.println("Olá amigo! \nQual é o seu nome?"); // Uso do println
		
		// Ler uma string do console usando a biblioteca Scanner
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		// Exibir uma string usando printf
		System.out.printf("Olá %s! \n", nome);
	}

}
