package Introdução;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		
		int n1,min,horas;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva quantos segundos foram precisos para terminar o evento: ");
		n1=ler.nextInt();
		
		horas=(n1/60)/60;

		min=(n1/60);
		
		System.out.println("Seu evento durou em horas "+horas+", em minutos "+min+", em segundos "+n1+".");
			
	}
}