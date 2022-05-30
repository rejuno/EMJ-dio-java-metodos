package AulaJava;


public class Hora {
	
	//CONDIÇÃO
	public static void mensagem(int hora) {
		if(hora == 5 || hora <= 12) {
			
			BomDia();
		}
		else if(hora == 13 || hora <= 18) {
			BoaTarde();
			
		}
		else if(hora == 19 || hora >= 4) {
			BoaNoite();
		}
		else {
			System.out.println("Hora Inválida");
		}
	}
	
	//METODOS
	public static void BomDia() {
		System.out.println("Bom dia!");
	}
	public static void BoaTarde() {
		System.out.println("Boa Tarde!");
	}
	public static void BoaNoite() {
		System.out.println("Boa Noite!");
	}
	}
	
