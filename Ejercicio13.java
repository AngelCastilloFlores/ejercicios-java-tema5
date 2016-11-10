import java.util.Scanner;

//Escribe un programa que lea una lista de diez números y determine cuántos son positivos,y cuántos son negativos.

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int negativos = 0; 
		int positivos = 0;
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Introduzca 10 números: ");
			int numeroIntroducido = teclado.nextInt();
			
			if (numeroIntroducido <0){
				negativos++;
			}else{
				positivos++;
			}
		}
		
		System.out.println("Ha introducido " + positivos + " positivos y " + negativos + " negativos");
			

	}

}
