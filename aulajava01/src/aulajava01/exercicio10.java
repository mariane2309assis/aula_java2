package aulajava01;
import java.util.Scanner;

public class exercicio10 {
	public static void main (String[]args) {
		Scanner input = new Scanner (System.in);
		int a1,a2,a3,a4,a5;
		int c = 0;
		System.out.println("telefonou para a vítima?1sim e 2não");
		a1= input.nextInt();
		if  (a1 == 1) {
			c=c+1;}
		
		System.out.println("esteve no local do crime?");
		a2= input.nextInt();
		if  (a2 == 1) {
		c=c+1;}
		
		System.out.println("mora perto da vítima?");
		a3= input.nextInt();
		if  (a3 == 1) {
		c=c+1;}
		
		System.out.println("devia para a vítima?");
		a4= input.nextInt();
		if  (a4 == 1) {
			c=c+1;}
		
		System.out.println(" já trabalhou com a vítima?");
		a5= input.nextInt();	
		if  (a5 == 1) {
		c=c+1;}
			
	if (c == 2) {
		System.out.println("Suspeita");
	}
	else if (c == 3||c==4) {
		System.out.println("Cúmplice");
	}
	else if (c==5) {
		System.out.println("assassino");
	}
	else {
		System.out.println("inocente");
	}
	}
	
}
