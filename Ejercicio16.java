import java.util.Scanner;

//Escribe un programa que diga si un número introducido por teclado es o no primo. 
//Un número primo es aquel que sólo es divisible entre él mismo y la unidad.

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Este programa le dirá si un número introducido es primo o no.");
		System.out.println("Introduzca un número: ");
		int numeroIntroducido = teclado.nextInt();
		
		boolean primo = true;
		
		for (int i = 2; i < numeroIntroducido; i++) { //le damos un valor a i, para luego poder tomarlo como el cociente y calcular si es divisible o no.
		      if ((numeroIntroducido % i) == 0) { //operación para calcular si es primo o no.
		        primo = false;
		      }
		    }
		
		if (primo){
			System.out.println("El número que ha introducido es primo.");
		}else{
			System.out.println("El número que ha introducido NO es primo.");
		}
	
		}

	}


