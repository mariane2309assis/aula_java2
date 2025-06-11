package aulajava01;
import java.util.Scanner;
public class exercicio07 {
	public static void main(String[]args) {
		Scanner input = new Scanner (System.in);
		int a;
		System.out.println("digite um numero de 1-7");
		a= input.nextInt();
		
		switch (a) {
		case 1 ->
			System.out.println("domingo");
		case 2 ->
			System.out.println("segunda");
		case 3 -> 
			System.out.print("terça");
		case 4 ->
			System.out.println("quarta");
		case 5 ->
			System.out.println("quinta");
		case 6 ->
			System.out.println("sexta");
		case 7 ->
			System.out.println("sabado");
		case 8 ->
			System.out.println("domingo");
		default -> 
			System.out.println("numero invalido");
			break;
		}

	}
}
