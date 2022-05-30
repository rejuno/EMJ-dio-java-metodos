package AulaJava;
import java.util.Scanner;
import java.lang.System;
public class Sobrecarga {
	//Outra forma de fazer disponivel nesse repositorio: https://github.com/tlcdio/MAula02/tree/master/src/one/digitalinnovation/basecamp
	//CONDICAO
	public static void opcao(int opcao) {
		
		Scanner l = new Scanner(System.in);
		switch(opcao) {
		case 1:
			
			System.out.println("Digite o valor do lado: ");
			int lado = l.nextInt();
			
			quadrado(lado);
			break;
		
		case 2:
			
			System.out.println("Digite o valor do primeiro lado:");
			int lado1 = l.nextInt();
		
			System.out.println("Digite o valor do segundo lado:");
			int lado2 = l.nextInt();
			
			retangulo(lado1, lado2);
			break;
		
		case 3:
			
			System.out.println("Digite o valor da base menor: ");
			int menor = l.nextInt();
			
			System.out.println("Digite o valor da base maior: ");
			int maior = l.nextInt();
			
			System.out.println("Digite o valor da altura: ");
			int h = l.nextInt();
			
			trapezio(menor, maior, h);
			break;
		default:
			
			System.out.println("Opção Inválida");
			break;
		}
		
	}
	public static void retangulo(int lado1, int lado2) {
		int resultador = lado1*lado2;
		System.out.println(resultador);
		
	}
	public static void quadrado(int lado) {
		
		int resultadoq = lado*lado;
		System.out.println(resultadoq);
		
		
	}
	public static void trapezio(int menor, int maior, int h) {
		int resultadot = (maior+menor)*h/2;
		System.out.println(resultadot);
	
	}
	
}
