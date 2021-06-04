package generation;

import java.util.Scanner;

public class Exercicio03Repetição {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade = 0, menos21 = 0, mais50 = 0;

		while(idade != 99) {
			
			System.out.println("Insira sua idade");
			idade = ler.nextInt();
			
			if(idade < 21) {
				
				menos21++;
				
			}
			
			else if(idade > 50) {
				
				mais50++;
				
			}
			
		}
		

		System.out.println("Foram inseridos " + menos21 + " idades menores de 21 e " + mais50 + " maiores que 50");
		
	}

}
