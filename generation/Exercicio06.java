package generation;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double x1, x2, y1, y2;
		
		double d, raiz;
		
		System.out.println("Digite o valor de X no 1� ponto: ");
		x1 = entrada.nextDouble();
		
		System.out.println("Digite o valor de y no 1� ponto: ");
		y1 = entrada.nextDouble();
		
		System.out.println("Digite o valor de X no 2� ponto: ");
		x2 = entrada.nextDouble();
		
		System.out.println("Digite o valor de y no 2� ponto: ");
		y2 = entrada.nextDouble();
		
		d = ((x2 - x1) * (x2 - x1) + (y2 - y1) + (y2 - y1));
		raiz = Math.sqrt(d);
		
		System.out.println("A raiz quadrada �: " + raiz );
		
		entrada.close();
		
		
		
	}

}
