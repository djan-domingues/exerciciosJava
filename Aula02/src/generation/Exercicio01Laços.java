package generation;

import java.util.Scanner;

public class Exercicio01Laços {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double numero1, numero2, numero3, numeromaior = 0;
		
		System.out.println("Insira o primeiro numero: ");
		numero1 = ler.nextDouble();
		
		System.out.println("Insira o primeiro numero: ");
		numero2 = ler.nextDouble();
		
		System.out.println("Insira o primeiro numero: ");
		numero3 = ler.nextDouble();
		
		if (numero1 > numeromaior) {
			
			numeromaior = numero1;
			
		}

		
		if (numero2 > numeromaior) {
			
			numeromaior = numero2;
			
		}
		
		if (numero3 > numeromaior) {
			
			numeromaior = numero3;
			
		}
		
		System.out.println("O maior numero é: " + numeromaior);
		
		
		
		
		
}

}
