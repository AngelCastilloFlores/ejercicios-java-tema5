//Realiza un programa que pinte una piramide por pantalla. 
//La altura se pide por teclado. El caracter con el que se pinte
//debe ser pedido por pantalla

import java.util.Scanner;


public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca la altura que desee:");
		int alturaIntroducida=teclado.nextInt();
		
		System.out.println("Introduzca el caracter de relleno: ");
		int relleno = teclado.nextInt();
		
		
		int altura = 0;
		int i = 1;
		int espacios = alturaIntroducida -1;
		
		while (altura <= alturaIntroducida){
			
			for (i = 1; i <= espacios; i++){
				System.out.println(" ");
			}
			
			 for (i = 1; i < altura * 2; i++) {
			        System.out.print(relleno);
			      }
			 
			 System.out.println();

		      altura++;
		      espacios--;
		
		
		


	    }
	  }
}
	
