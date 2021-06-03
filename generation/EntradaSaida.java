package generation;

import java.util.Scanner;

public class EntradaSaida {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int a, b, soma;
		
		System.out.println("Escreva o valor de A:");
		a = entrada.nextInt();
		
		System.out.println("Escreva o valor de B: ");
		b = entrada.nextInt();
		
		soma = a + b;
		
		System.out.println("A soma dos numeros é :" + soma);
		
		entrada.close();
		
		
		
				
				
		
		
		
	}

}
