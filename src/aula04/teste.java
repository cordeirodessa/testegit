package aula04;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double nota1;
		double nota2;
		double nota3;
		int count = 0;
		double nota;

		System.out.println("Digite a primeira nota: ");
		nota1 = sc.nextDouble();

		System.out.println("Digite a segunda nota: ");
		nota2 = sc.nextDouble();

		System.out.println("Digite a terceira nota: ");
		nota3 = sc.nextDouble();

		double media = (nota1 + nota2 + nota3) / 3;

		System.out.println("A média das notas é " + media);

		if (nota1 < 6) {
			count++;
		}
		if (nota2 < 6) {
			count++;
		}
		if (nota3 < 6) {
			count++;
		}

		System.out.println("Quantidade de notas menores que 6: " + count);
		return;
	}
}
