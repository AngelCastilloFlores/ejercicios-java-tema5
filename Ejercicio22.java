import java.util.Scanner;

//Ejercicio 22 Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
public class Ejercicio22 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		boolean esPrimo = true;
		
		
		
		for (int num = 2; num <= 100; num++){
			
			System.out.println(num);
			
			 esPrimo = true;
		      for (int i = 2; i < num; i++) {
		        if (num % i == 0) {
		          esPrimo = false;
		        }
		      }
		      
		      if (esPrimo) {
		        System.out.print(num + " ");
		      }
		    }
		    System.out.println();
		  }
		}
