import java.util.Scanner;

//Muestra la tabla de multiplicar de un n�mero introducido por teclado.
public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Este programa te mostrar� la tabla de multiplicar del n�mero que introduzcas.");
		System.out.println("");
		System.out.println("Introduzca un n�mero entero: ");
		System.out.println("");
		int numeroIntroducido = teclado.nextInt();
		
		for (int i = 0; i <= 10; i++){ // El n�emro se inicia en 0, y limitamos a 10 su multiplicaci�n.
			
			 System.out.println(numeroIntroducido + " x " + i + " = " + numeroIntroducido * i);
		}

	}

}
