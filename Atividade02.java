package Introdução;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
	
		int n1,dias,ano,mes;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva a quantos dias esta vivo: ");
		
		n1=ler.nextInt();
		
		dias=(n1);
	
		mes=(n1/30);
	
		ano=(n1/365);
		
		System.out.println("Você esta vivo a "+n1+" dias, "+mes+ " meses, e "+ano+" anos.");
	}

}