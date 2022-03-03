package Introdução;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		
		int n1,n2,n3,ano,mes,total,anoAtual;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva o dia que nasceu: ");
		
		n1=ler.nextInt();
		
		System.out.println("Escreva o mês que nasceu: ");
		
		n2=ler.nextInt();
		
		mes = (n2*30);
		
		System.out.println("Escreva o ano que nasceu: ");
		
		n3=ler.nextInt();
		
		System.out.println("Escreva o ano que estamos: ");
		
		anoAtual=ler.nextInt();
		
		ano=(n3/anoAtual)*360;
				
		total=(ano+mes+n1);
		
		System.out.println("Você esta vivo ah "+total+" Dias.");
		
	}
}