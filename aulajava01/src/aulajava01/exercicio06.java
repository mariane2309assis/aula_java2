package aulajava01;
import java.util.Scanner;

public class exercicio06 {
	public static void main (String[]args) {
		
		Scanner e = new Scanner (System.in);
		
		int a;
		int b;
		int c;
		
		System.out.println("digite o 1° numero");
		a=e.nextInt();
		System.out.println("digite o 2° numero");
		b= e.nextInt();
		System.out.println("digite o 3° numero");
		c= e.nextInt();
		if (a > b && a>c) {
			System.out.println (a);}
		
		else if (b>a && b>c) {
		System.out.println(b);}
		else {
			System.out.println(c);}
		e.close();
	}
	
}

