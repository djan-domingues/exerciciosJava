package generation;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double A, B, C, D , E , F, X, Y;
		
		System.out.println("Entre com o 1º numero: ");
		A = entrada.nextInt();
		
		System.out.println("Entre com o 2º numero: ");
		B = entrada.nextInt();
		
		System.out.println("Entre com o 3º numero: ");
		C = entrada.nextInt();
		
		System.out.println("Entre com o 4º numero: ");
		D = entrada.nextInt();
		
		System.out.println("Entre com o 5º numero: ");
		E = entrada.nextInt();
		
		System.out.println("Entre com o 6º numero: ");
		F = entrada.nextInt();
		
		
		X = ((C * E) -(B * F)) /  ((A * E) -(B * D));
		
		Y = ((A * F) -(C * D)) /  ((A * E) -(B * D));
		
		
		System.out.println("O resultado de X é " + X + " e o resultado de Y é: " + Y);


	}

}
