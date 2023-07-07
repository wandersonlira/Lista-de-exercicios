package exercicio1.negativos;

import java.util.Scanner;

public class Negativos {
	
	public static void main(String[] args) {
		
		Scanner LerTeclado = new Scanner(System.in);
		
		System.out.printf("Digite quantidade de números: ");
		int quantidadeNumero = LerTeclado.nextInt();
		
		int[] vetorInteiro = new int[quantidadeNumero];
		
		
		for (int i=0; i<vetorInteiro.length; i++) {
			System.out.printf("["+(i+1)+"] " + "valor: ");
			vetorInteiro[i] = LerTeclado.nextInt();	
		}

		for (int w=0; w<vetorInteiro.length; w++) {
			if(vetorInteiro[w] < 0) {
				System.out.println("Negativos: " + vetorInteiro[w]);
			}
		}
		
		LerTeclado.close();
	}

}
