package aulajava01;

import java.util.Scanner;

public class Desafio01 {
	public static void main(String[] args) {
		int a = 0;
		Scanner e = new Scanner(System.in);
		System.out.println("digite um numero");
		a=e.nextInt();
		System.out.println( a>0? "positivo" : a<0 ? "negativo":"0, é neutro"  );
	}
}
