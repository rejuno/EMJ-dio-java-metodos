package AulaJava;

public class Emprestimo {
/*
 * valor solicitado
 * valor final = valor solicitado * taxas;
 * 
 * */
	
	public static int DuasParcelas() {
		return 2;
		
	}
	public static int TresParcelas() {
		return 3;
		
	}
	
	public static double TaxaDuasParcelas() {
		return 0.2;
	}
	public static double TaxaTresParcelas() {
		return 0.3;
	}
	
	public static void calculo(double valor, int parcelas) {
		
		if(parcelas == 2) {
			
			double valorFinal = valor + (valor* TaxaDuasParcelas());
			System.out.println("Valor final do empr�stimo para 2 parcelas: R$ " + valorFinal);
		
		} else if(parcelas == 3) {
			
			double valorFinal = valor + (valor * TaxaTresParcelas());
			System.out.println("Valor final do empr�stimo para 3 parcelas: R$ " + valorFinal);
			
		} else {
			 System.out.println("Quantidade de parcelas n�o aceita.");
		}
		
	}
	
	
}
