package generation;

import java.util.Scanner;

public class Exercicio06Repetição {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero = 0, soma = 0, quant = 0;
		double media = 0;
		
		do {
			
			System.out.println("Insira um número:" );
			numero = ler.nextInt();
			
			if(numero % 3 == 0) {
			quant++;
			soma = soma + numero;
			
			}
			
		} while(numero != 0);
		
		media = soma / quant;
		
		System.out.println("média: " + media);

	}

}
