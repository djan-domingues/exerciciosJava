package generation;

import java.util.Scanner;

public class Exercicio02Repeti��o {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero = 0, par = 0, impar = 0, quantNum = 0;
		
		while(quantNum < 10) {
			
			System.out.println("Insira um numero: ");
			numero = ler.nextInt();
			
			quantNum++;
			
			if(numero % 2 == 0) {
				
				par++;
				
			}
			
			
			else {
				
				impar++;
				
			}
			
			
			
			
		}
		
		System.out.println("Foram inseridos " + par + " n�meros pares\n");
		System.out.println("Foram inseridos " + impar + " n�meros impares\n");
			

	}

}
