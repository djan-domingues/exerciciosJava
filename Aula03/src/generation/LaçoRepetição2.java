package generation;

import java.util.Scanner;

public class La�oRepeti��o2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int numero = 0;
		
		while(numero != 10) {
			
			System.out.println("Digite um numero: ");
			
			numero = in.nextInt();
			
			if(numero == 10) {
				
				System.out.println("Acertou! ");
				
			}
			
			else {
				
				System.out.println("Errou :( ");
				
			}
		}
		
	}

}
