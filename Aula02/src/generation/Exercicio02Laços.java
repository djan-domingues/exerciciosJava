package generation;

import java.util.Scanner;

public class Exercicio02Laços {
	
        public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int x, y, z;
		
		System.out.println("Digite o primeiro numero: ");
		x = entrada.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		y = entrada.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		z = entrada.nextInt();
		
		if(x < y && y < z) {
			
			System.out.println("A ordem crescente é: " + x  + " " + y + " " + z);
			
		}
		
		else if(x < z && z < y) {
			
			System.out.println("A ordem crescente é: " + x + " " + z + " " + y);
			
		}
		
		else if(y < x && x < z) {
			
			System.out.println("A ordem crescente é: " + y + " " + x + " " + z);
			
		}
		
		else if(y < z && z < x) {
			
			System.out.println("A ordem crescente é: " + y + " " + z + " " + x);
			
		}
		
		else if(z < x && x < y) {
			
			System.out.println("A ordem crescente é: " + z + " " + x + " " + y);
			
		}
		
		else {
			
			System.out.println("A ordem crescente é: " + z + " " +  y + " " + x);
			
		}
		
		
		
	
		
		
		
   }
}
