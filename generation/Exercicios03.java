package generation;

import java.util.Scanner;

public class Exercicios03 {

	public static void main(String[] args) {
		
Scanner entrada = new Scanner(System.in);
		
		int tempoHoras, tempoMinutos, tempoFinal, tempoSegundos, tempoSegundosFinal;
		
		System.out.println("Qual � o tempo de dura��o do evento em segundos ? ");
		tempoSegundos = entrada.nextInt();
		
		tempoHoras = tempoSegundos / 3600;
		tempoMinutos = (tempoSegundos % 3600) / 60;
		tempoSegundosFinal = ((tempoSegundos % 3600) % 60);

		
		
		System.out.println("Levou " + tempoHoras + " horas, " + tempoMinutos + " minutos e " + tempoSegundosFinal + " segundos.");

	}

}