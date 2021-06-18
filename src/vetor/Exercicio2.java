package vetor;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

	
			Scanner sc = new Scanner(System.in);
			
			double vet[] = new double [10];
			
			for(int i=0;i<10;i++) {
				vet[i] = sc.nextDouble();
			}

			for(int i=0;i<10;i++) {
				System.out.println(vet[i]);
			}
			System.out.println();
			for(int i=0;i<10;i++) {
			if(vet[i]<0) {
			
				System.out.println("Números negativos "+ vet[i]);
			}
			
			}
			sc.close();
	}
}
