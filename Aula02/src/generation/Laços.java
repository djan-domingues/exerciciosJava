package generation;

import java.util.Scanner;

public class Laços {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Digite a 1ª nota: ");
		nota1 = ler.nextDouble();
		
		System.out.println("Digite a 2ª nota: ");
		nota2 = ler.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 7.0) {
			
			System.out.println("Parabéns, você foi aprovado! sua nota foi: " + media);
			
		}
		
		else if(media >= 5.0 && media < 7.0) {
			
			System.out.println("Você esta de recuperação! sua nota foi: " + media);
			
		}
		
		else {
			
			System.out.println("Você foi reprovado! sua nota foi: " + media);
			
		}
		

	}

}
