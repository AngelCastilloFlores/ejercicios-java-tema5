import java.util.Scanner;

//Escribe un programa que obtenga los números enteros comprendidos entre dos
//números introducidos por teclado y validados como distintos,el programa debe empezar por el menor de los enteros 
//introducidos e ir incrementando de 7 en 7.

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numero1 = 0;
		int numero2 = 0;
		
		System.out.println("Debe introducir dos números por teclado.");
		
		for(int i=0; i < 1; i++){
		
		System.out.println("A continuación, introduzca un número por teclado: ");
		numero1 = teclado.nextInt();
		
		System.out.println("Introduzca otro número: ");
		numero2 = teclado.nextInt();
		
		if(numero1 == numero2) {
	        System.out.println("Los números introducidos no son válidos, deben ser distintos.");
	      }
		
	    } while (numero1 == numero2);
	    
		
		if (numero1 > numero2) {
		      int aux = numero1;
		      numero1 = numero2;
		      numero2 = aux;
		    }
		    
		    for(int i = numero1; i <= numero2; i += 7) {
		      System.out.print(i + " ");
		    }
		    
		    System.out.println();
		    
	}
}

	