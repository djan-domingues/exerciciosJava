package generation;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double n1, n2, n3, p1, p2, p3, media;
		
		System.out.println("Programa Média ponderada.");
		System.out.println("Insira a 1ª nota: ");
		n1 = entrada.nextDouble();
		
		System.out.println("Insira o 1º peso: ");
		p1 = entrada.nextDouble();
		
		System.out.println("Insira a 2ª nota: ");
		n2 = entrada.nextDouble();
		
		System.out.println("Insira o 2º peso: ");
		p2 = entrada.nextDouble();
		
		System.out.println("Insira a 3ª nota: ");
		n3 = entrada.nextDouble();
		
		System.out.println("Insira o 3º peso: ");
		p3 = entrada.nextDouble();
		
		media = ((n1 * p1) + (n2 * p2) + (n3 * p3)) / 3;
		System.out.println("A média ponderada do aluno é: " + media);
		
		entrada.close();
		
		
		
	}

}
