import java.util.Scanner;

//Muestra la tabla de multiplicar de un número introducido por teclado.
public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Este programa te mostrará la tabla de multiplicar del número que introduzcas.");
		System.out.println("");
		System.out.println("Introduzca un número entero: ");
		System.out.println("");
		int numeroIntroducido = teclado.nextInt();
		
		for (int i = 0; i <= 10; i++){ // El núemro se inicia en 0, y limitamos a 10 su multiplicación.
			
			 System.out.println(numeroIntroducido + " x " + i + " = " + numeroIntroducido * i);
		}

	}

}
