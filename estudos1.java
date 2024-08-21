package estudos;

import java.util.Scanner;

public class estudos1 {

	public static void main(String[] args) {
		//Escreva um programa em Java que preencha um vetor de 10 posições com valores
		//fornecidos pelo usuário. Imprima no vídeo o maior e o menor valor armazenado.
		//Observação: maior valor inteiro é Integer.MAX_VALUE e o menor valor inteiro é
		//Integer.MIN_VALUE

		
		Scanner in = new Scanner(System.in);
		
		int[] x = new int[10];
		int menor = Integer.MAX_VALUE;
		int maior = Integer.MIN_VALUE;
		int aux; 
		
		for (int i = 0; i < x.length; i++) {
			System.out.println("Insira os valores");
			x[i] = in.nextInt();
			
		}
		
		for (int i = 0; i < x.length; i++) {
		if (x[i] > maior) {
			maior = x[i];
		}
			if ( x[i] < menor) {
				menor = x[i];
			}
		}
		System.out.print("o menor é " + menor + " o maior é " + maior);
		
	}

}
