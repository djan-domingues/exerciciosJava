package generation;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
Scanner entrada = new Scanner(System.in);
		
		int idadeAnos, idadeMeses, idadeFinal, idadeDias, idadeDiasFinal;
		
		System.out.println("Quantos anos você tem em dias ? ");
		idadeDias = entrada.nextInt();
		
		idadeAnos = idadeDias / 365;
		idadeMeses = (idadeDias % 365) / 12;
		idadeDiasFinal = ((idadeDias % 365) % 12);

		
		
		System.out.println("Voce tem " + idadeAnos + " anos, " + idadeMeses + " meses e " + idadeDiasFinal + " dias de idade.");

	}

}
