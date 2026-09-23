
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner scanne = new Scanner(System.in);
	    System.out.println("===Calculadora Simples===");
		System.out.print("Digite seu numero:");
		Double num = scanne.nextDouble();
		System.out.println("Escolha entre (+ / - / * / %): ");
		char op = scanne.next().charAt(0);
		System.out.printf("Resultado: %.2f %c", num, op);
	}
}
