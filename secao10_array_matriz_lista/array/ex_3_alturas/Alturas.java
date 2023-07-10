package exercicio3_alturas;

import java.util.Scanner;
public class Alturas {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Informe números de pessoas: ");
		int numOpcao = ler.nextInt();
		
		Pessoas[] vetorPessoas = new Pessoas[numOpcao];
		
		float pegarAltura = 0, contIdade = 0;
		
		
		for (int i=0; i<vetorPessoas.length; i++) {
			
			ler.nextLine();
			
			System.out.printf("Nome: ");
			String nome = ler.nextLine();
			
			System.out.printf("Idade: ");
			int idade = ler.nextInt();
			
			if (idade < 16) {
				contIdade++;
			}
			
			System.out.printf("Altura: ");
			float altura = ler.nextFloat();
			
			pegarAltura += altura;
			
			vetorPessoas[i] = new Pessoas(nome, idade, altura);
		}
		
		ler.close();
		
		float porcenIdade = ((contIdade/vetorPessoas.length) * 100), alturaMedia = (pegarAltura/vetorPessoas.length);
		
		System.out.println("------------- MOSTRAR RESULTADO --------------\n");
		
		System.out.printf("Altura média: %.2f%n", alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcenIdade);
		
		
		for (int i=0; i<vetorPessoas.length; i++) {

			if (vetorPessoas[i].getIdade() < 16) {
				System.out.println("Nome: "+ vetorPessoas[i].getNome());
			}
		}
		
	}
}
