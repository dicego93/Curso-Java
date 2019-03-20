//VIDEO 48 TIPO ENUMERADO. ENUM

package poo;

import java.util.Scanner;

public class Uso_tallas {
	
	
	
	enum Talla {
		MINI("S"),MEDIANO("M"),GRANDE("L"),MUYGRANDE("XL");
		
		private String abreviatura;
		
		private Talla(String abreviatura) {
			
			this.abreviatura=abreviatura;
		}
	
	
	public String dameAbreviatura() {
		return abreviatura;
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY GRANDE");
		
		String entrada_datos=entrada.next().toUpperCase();
		
		Talla la_talla=Enum.valueOf(Talla.class, entrada_datos);
		
		System.out.println("Talla: "+la_talla);
		System.out.println("Abreviatura="+ la_talla.dameAbreviatura());

	}

}
