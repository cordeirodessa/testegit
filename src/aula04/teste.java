package aula04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double nota5;
		int count = 0;
		double nota;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = sc.nextDouble();

		System.out.println("Digite a segunda nota: ");
		nota2 = sc.nextDouble();

		System.out.println("Digite a terceira nota: ");
		nota3 = sc.nextDouble();
		
		System.out.println("Digite a quarta nota: ");
		nota4 = sc.nextDouble();
		
		System.out.println("Digite a quinta nota: ");
		nota5 = sc.nextDouble();
					
		double media = (nota1 + nota2 + nota3 + nota4 + nota5) / 3;
		
		nota = sc.nextDouble();

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
		if (nota4 < 6) {
			count++;
		}
		if (nota5 < 6) {
			count++;
		}
		
		System.out.println("Quantidade de notas menores que 6: " + count);
				
		double maiorNota = Math.max(nota1, Math.max(nota2, Math.max(nota3, Math.max(nota4, nota5))));
		double menorNota = Math.min(nota1, Math.min(nota2, Math.min(nota3, Math.min(nota4, nota5))));
		
		System.out.println("Maior nota: " + maiorNota);
		System.out.println("Menor nota: " + menorNota);
	}
}
