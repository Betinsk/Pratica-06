package vetor;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int vet[] = new int [10];
		int soma = 0;
		
		for(int i=0;i<10;i++) {
			vet[i] = sc.nextInt();
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(vet[i]);
		
			if(vet[i] %2==0) {
				soma +=vet[i];
			}
		}
		
		System.out.println();
		System.out.println("Soma " + soma);
		
		
		sc.close();

	}

}
