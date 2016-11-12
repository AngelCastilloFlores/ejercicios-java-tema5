import java.util.Scanner;

//Realiza un programa que pida un número por teclado y que luego muestre ese número alrevés.

public class Ejercicio25 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Este programa le mostrará el número que introduzca del revés: ");
		System.out.println("A continuación, introduzca un número: ");
		int numeroIntroducido = teclado.nextInt();

	    int numero = numeroIntroducido;
	    int vuelta = 0;
	    
	    while (numero > 0) {
	      vuelta = (vuelta * 10) + (numero % 10);
	      numero /= 10;
	    }
	    
	    System.out.println("El número que has introducido " +numeroIntroducido + " dado la vuelta, sería:"+vuelta);
	  }
	}