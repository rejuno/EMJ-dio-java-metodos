package AulaJava;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//Aqui vai executar!
		Scanner r = new Scanner(System.in);
		
		//CALCULO
		
		System.out.println("Digite o primeiro n�mero: ");
		double a = r.nextDouble();
		System.out.println("Digite o segundo n�mero: ");
		double b = r.nextDouble();
		
		System.out.println("Resultados");
		
		System.out.println("Soma");
		System.out.println(Calculo.soma(a, b));
		
		System.out.println("Subtra��o");
		System.out.println(Calculo.subtracao(a, b));
		
		System.out.println("Multiplica��o");
		System.out.println(Calculo.multiplicacao(a, b));
		
		System.out.println("Divis�o");
		System.out.println(Calculo.divisao(a, b));

		//HORA
		Scanner e = new Scanner(System.in);
		
		System.out.println("Que horas s�o? ");
		int hora = e.nextInt();
		Hora.mensagem(hora);
		
		//EMPRESTIMO
		System.out.println("Exerc�cio empr�stimo");
        Emprestimo.calculo(1000, Emprestimo.DuasParcelas());
        Emprestimo.calculo(1000, Emprestimo.TresParcelas());
        Emprestimo.calculo(1000, 5);
		
		
	}

}
