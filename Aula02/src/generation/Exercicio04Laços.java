package generation;

import java.util.Scanner;

public class Exercicio04La�os {

	public static void main(String[] args) {

	Scanner ler = new Scanner(System.in);
		
		int numero;
		double raiz, quadrado;
		
		System.out.println("Insira um numero: ");
		numero = ler.nextInt();
		
		if(numero % 2 == 0) {
			
			raiz = Math.sqrt(numero);
			System.out.println("O numero inserido foi: " + numero + " e sua raiz �: " + raiz);
			
		}
		
		else {
			
			quadrado = numero * numero;
			System.out.println("O numero inserido foi: " + numero + " e elevado a 2 �: " + quadrado);
			
		}
		
		
	}
	

}
