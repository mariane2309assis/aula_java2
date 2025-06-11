package aulajava01;
import java.util.Scanner;

public class exercicio09 {
	public static void main(String[]args) {
		Scanner input = new Scanner (System.in);
		char x;
	
		System.out.println("digite f ou m");
		x= input.next().charAt(0);
		if (x == 'm'){
			System.out.println ("masculino");}
		else if (x == 'f') {
			System.out.println ("feminino");}
	
		else {
			System.out.println("resposta inválida");
		

		}
	}	
}
