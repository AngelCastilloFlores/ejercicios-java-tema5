import java.util.Scanner; //Ejercicio sin acabar

//Escribe un programa que permita ir introduciendo una serie indeterminada de números mientras
//su suma no supere el valor 10000. Cuando esto último ocurra, se debe mostrar el total acumulado, 
//el contador de los números introducidos y la media.

public class Ejercicio23 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numeroIntroducido;
		int suma = 0;
		
		
		do {
		      numeroIntroducido = teclado.nextInt();
		      suma += numeroIntroducido;
		    } while (suma <= 10000);
		
				System.out.println("La suma total es " + suma + ".");
			    System.out.println("La media es " + suma);
	
	}

	}


