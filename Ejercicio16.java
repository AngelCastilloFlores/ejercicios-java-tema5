import java.util.Scanner;

//Escribe un programa que diga si un n�mero introducido por teclado es o no primo. 
//Un n�mero primo es aquel que s�lo es divisible entre �l mismo y la unidad.

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Este programa le dir� si un n�mero introducido es primo o no.");
		System.out.println("Introduzca un n�mero: ");
		int numeroIntroducido = teclado.nextInt();
		
		boolean primo = true;
		
		for (int i = 2; i < numeroIntroducido; i++) { //le damos un valor a i, para luego poder tomarlo como el cociente y calcular si es divisible o no.
		      if ((numeroIntroducido % i) == 0) { //operaci�n para calcular si es primo o no.
		        primo = false;
		      }
		    }
		
		if (primo){
			System.out.println("El n�mero que ha introducido es primo.");
		}else{
			System.out.println("El n�mero que ha introducido NO es primo.");
		}
	
		}

	}


