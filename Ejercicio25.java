import java.util.Scanner;

//Realiza un programa que pida un n�mero por teclado y que luego muestre ese n�mero alrev�s.

public class Ejercicio25 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Este programa le mostrar� el n�mero que introduzca del rev�s: ");
		System.out.println("A continuaci�n, introduzca un n�mero: ");
		int numeroIntroducido = teclado.nextInt();

	    int numero = numeroIntroducido;
	    int vuelta = 0;
	    
	    while (numero > 0) {
	      vuelta = (vuelta * 10) + (numero % 10);
	      numero /= 10;
	    }
	    
	    System.out.println("El n�mero que has introducido " +numeroIntroducido + " dado la vuelta, ser�a:"+vuelta);
	  }
	}