package generation;

import java.util.Scanner;

public class La�os {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Digite a 1� nota: ");
		nota1 = ler.nextDouble();
		
		System.out.println("Digite a 2� nota: ");
		nota2 = ler.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 7.0) {
			
			System.out.println("Parab�ns, voc� foi aprovado! sua nota foi: " + media);
			
		}
		
		else if(media >= 5.0 && media < 7.0) {
			
			System.out.println("Voc� esta de recupera��o! sua nota foi: " + media);
			
		}
		
		else {
			
			System.out.println("Voc� foi reprovado! sua nota foi: " + media);
			
		}
		

	}

}
