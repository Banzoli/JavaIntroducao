package Introdução;

import java.util.Scanner;

public class Atividade07 {
	
	public static void main(String[] args) {
	
		int A,B,C,D,E,F,X,Y,M,N,U;
		Scanner ler = new Scanner(System.in);
	
		A=05;
		B=10;
		C=120;
		D=70;
		E=25;
		F=30;
		
		M=(C + E) - (B + F);
		N=(A + E) - (B + D);
		X=M/N;
		U=(A + F) - (C + D);
		Y=U/N;
	
		System.out.println("Y igual ah "+Y+", X igual "+X+".");
		
	}
}