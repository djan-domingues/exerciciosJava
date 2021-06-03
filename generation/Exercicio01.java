package generation;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade, idadeMeses, idadeDias, idadeDiasFinal,idadeMesesDias, idadeAnosDias;
		
		System.out.println("Quantos anos você tem ? ");
		idade = entrada.nextInt();
		
		System.out.println("E quantos meses ? ");
		idadeMeses = entrada.nextInt();
		
		System.out.println("E quantos dias ? ");
		idadeDias = entrada.nextInt();
		
		idadeAnosDias = idade * 365;
		
		idadeMesesDias = idadeMeses * 30;
				
		
		System.out.println("Sua idade em dias é: " + (idadeAnosDias + idadeMesesDias + idadeDias));
		
		
		
		

	}

}
