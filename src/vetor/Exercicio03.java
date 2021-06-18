package vetor;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		int maior = 0;
		int menor = 0;
	
		int vet[] = new int [10];
		
		for(int i=0;i<10;i++) {
			vet[i] = sc.nextInt();
	
			if(vet[i] > maior) {
				maior = vet[i];
			}
			
			if(vet[i] < menor) {
				menor = vet[i];
		     }
			
		}
	
		for(int i=0;i<10;i++) {
			System.out.println(vet[i]);
		}
		
		
		System.out.println();
		System.out.println(maior);
		System.out.println(menor);

			
		
		
		sc.close();
	}

}
