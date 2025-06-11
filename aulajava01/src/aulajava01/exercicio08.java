package aulajava01;
import java.util.Scanner;

public class exercicio08 {
	public static void main (String[]args) {
		Scanner entrada = new Scanner (System.in);
		double a,b,media;
		System.out.println("digite a 1°");
		a=entrada.nextInt();
		System.out.println("digite a 2°");
		b=entrada.nextInt();
		
		media = (a+b)/2;
		
		System.out.println(media);
		
	}

}
