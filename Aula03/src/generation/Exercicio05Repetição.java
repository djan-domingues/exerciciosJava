package generation;

import java.util.Scanner;

public class Exercicio05Repeti��o {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero = 0, soma = 0;
		
		do {
			
			System.out.println("Insira um n�mero:" );
			numero = ler.nextInt();
			soma += numero;
			
		} while(numero != 0);
		
		System.out.println("Soma: " + soma);
			
			
		
	}

}
