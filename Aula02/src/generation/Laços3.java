package generation;

import java.util.Scanner;

public class Laços3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma letra a e d");
		String letra = entrada.nextLine();
		
		switch(letra) {
		
			case "a":
				
				System.out.println("Ana");
				
			break;
			
			case "b":
				
				System.out.println("Bruna");
			break;	
			
			case "c":
				
				System.out.println("Caruso");
			break;	
			
			case "d":
				
				System.out.println("Djan");
			break;
			
			default:
				
				System.out.println("letra inválida");
		
		}
		
		
	}

}
