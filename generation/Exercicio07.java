package generation;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double A, B, C, D , E , F, X, Y;
		
		System.out.println("Entre com o 1� numero: ");
		A = entrada.nextInt();
		
		System.out.println("Entre com o 2� numero: ");
		B = entrada.nextInt();
		
		System.out.println("Entre com o 3� numero: ");
		C = entrada.nextInt();
		
		System.out.println("Entre com o 4� numero: ");
		D = entrada.nextInt();
		
		System.out.println("Entre com o 5� numero: ");
		E = entrada.nextInt();
		
		System.out.println("Entre com o 6� numero: ");
		F = entrada.nextInt();
		
		
		X = ((C * E) -(B * F)) /  ((A * E) -(B * D));
		
		Y = ((A * F) -(C * D)) /  ((A * E) -(B * D));
		
		
		System.out.println("O resultado de X � " + X + " e o resultado de Y �: " + Y);


	}

}
