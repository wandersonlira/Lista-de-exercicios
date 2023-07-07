package exercicio2.soma_vetor;

import java.util.Scanner;

public class Soma_vetor {
	
	public static void main(String[] args) {
		
		Scanner lerTeclado = new Scanner(System.in);
		
		System.out.printf("Quantidade de números: ");
		int quantidadeNumero = lerTeclado.nextInt();
		
		int[] vetorInteiro = new int[quantidadeNumero];
		int somaNumero = 0;
		
		for (int i=0; i<vetorInteiro.length; i++) {
			System.out.println("Valor: ");
			vetorInteiro[i] = lerTeclado.nextInt();
			
			somaNumero += vetorInteiro[i];
		}
		
		float media = (somaNumero/vetorInteiro.length);
		
		lerTeclado.close();
		
		System.out.print("Valores digitados: ");
		for (int i=0; i<vetorInteiro.length; i++) {
			System.out.print(vetorInteiro[i] + " ");
		}
		System.out.println("");
		System.out.println("Soma: " + somaNumero);
		System.out.println("Media: " + media);
	}
	
}
