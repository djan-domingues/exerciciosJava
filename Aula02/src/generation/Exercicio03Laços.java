package generation;

import java.util.Scanner;

public class Exercicio03La�os {

public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Insira a idade: ");
		idade = ler.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			
			System.out.println("Categoria Infantil");
			
		}
		
		if(idade >= 15 && idade <= 17) {
			
			System.out.println("Categoria Juveil");
			
		}
		
		if(idade >= 18 && idade <= 25) {
			
			System.out.println("Categoria Adulto");
			
		}
		
		ler.close();
		
}

}
	
