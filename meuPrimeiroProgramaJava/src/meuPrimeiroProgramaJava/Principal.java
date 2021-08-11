/*Meu Primeiro Programa Java*

Este programa mostra
1) Que um programa � constru�do dentro de um projeto.
2) Todo programa deve ter uma classe com um m�todo main.
3) Como exibir informa��es no terminal (console).
4) Como ler uma string do terminal(console).

 */
package meuPrimeiroProgramaJava;

import java.util.Scanner;

/**
 * @author Seance
 * Data: 11/08/2021
 */
public class Principal { // Classe que cont�m o m�todo principal.
	public static void main(String[] args) { // Este � o m�todo principal.
		
		System.out.println("Ol� amigo! \nQual � o seu nome?"); // Uso do println
		
		// Ler uma string do console usando a biblioteca Scanner
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		// Exibir uma string usando printf
		System.out.printf("Ol� %s! \n", nome);
	}

}
