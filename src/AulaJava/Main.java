package AulaJava;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//SOBRECARGA
        Scanner s = new Scanner(System.in);
        
        System.out.println("O que deseja calcular? 1.Quadrado 2.Retangulo 3.Trapézio");
        int opcao = s.nextInt();
        Sobrecarga.opcao(opcao);
        
        
	}

}
