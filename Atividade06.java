package Introdução;

import java.util.Scanner;

public class Atividade06 {
	public static void main(String[] args) {
		
		double P,n1,n2,n3,n4,D,A,B,C;
		Scanner ler = new Scanner(System.in);
	
		System.out.println("Escreva o x1: ");
	
		n1=ler.nextDouble();
			
		System.out.println("Escreva o y1: ");
	
		n2=ler.nextDouble();
	
		System.out.println("Escreva o x2: ");
	
		n3=ler.nextDouble();
	
		System.out.println("Escreva o y2: ");
	
		n4=ler.nextDouble();
		
		A = (n3-n1)*2;
		
		B = (n4-n2)*2;
		
		C = (A+B);
	
		D = Math.sqrt(C);
	
		System.out.println("O resultado do calculo é "+ D);
		
	}
}