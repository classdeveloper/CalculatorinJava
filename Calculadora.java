package exercicios;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		System.out.printf("Insira o primeiro número: ");
		int num1 = ler.nextInt();
		
		System.out.printf("Insira o segundo número: ");
		int num2 = ler.nextInt();
		
		System.out.println("Selecione o tipo de operação: ");
		System.out.println("1) Adição");
		System.out.println("2) Subtração");
		System.out.println("3) Multiplicação");
		System.out.println("4) Divisão");
		int type = ler.nextInt();
		
		switch (type) {
		case 1:
			System.out.println("\nResultado: " + (num1 + num2));
			break;
		case 2:
			System.out.println("\nResultado: " + (num1 - num2));
			break;
		case 3:
			System.out.println("\nResultado: " + (num1 * num2));
			break;
		case 4:
			System.out.println("\nResultado: " + (num1 / num2));
			break;
			default:
				System.out.println("Operação não encontrada!");
		}
		ler.close();
	}
}
