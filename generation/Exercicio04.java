package generation;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
				
		double A, B, C, D , R , S;
		
		System.out.println("Entre com o 1� numero: ");
		A = entrada.nextInt();
		
		System.out.println("Entre com o 2� numero: ");
		B = entrada.nextInt();
		
		System.out.println("Entre com o 3� numero: ");
		C = entrada.nextInt();
		
		R = (A + B) * (A + B);
		
		S = (C + B) * (C + B);
		
		D = (R + S) / 2;
		
		System.out.println("O resultado �: " + D);

}
}
