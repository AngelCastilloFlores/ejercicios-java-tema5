import java.util.Scanner;

//Realiza el control de acceso a una caja fuerte. La combinaci�n ser� un
//n�mero de 4 cifras. El programa nos pedir� la combinaci�n para abrirla. Si no
//acertamos, se nos mostrar� el mensaje �Lo siento, esa no es la combinaci�n�
//y si acertamos se nos dir� �La caja fuerte se ha abierto satisfactoriamente�.
//Tendremos cuatro oportunidades para abrir la caja fuerte.


public class Ejercicio08 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
		int intentos = 3;
		int numeroIntroducido;
		boolean acertado = false;
		
		System.out.println("Hola, soy tu caja fuerte.");
		System.out.println("-------------------------");
		System.out.println("");
		System.out.println("Introduce la contrase�a para poder acceder a mi interior.");
		System.out.println("Recuerda que solo tienes 3 intentos.");
		System.out.println("");
		System.out.println("�Adelante!");
		System.out.println("");
		
		
		do {
			System.out.println("Introduzca la clave de la caja fuerte: ");
			numeroIntroducido = teclado.nextInt();
			
			if (numeroIntroducido == 7496){
				acertado = true;
			}else{
				System.out.println("Clave incorrecta.");
			}
			
			intentos --;
			
			}while ((intentos >= 0) && (!acertado));
			
			if (acertado){
				System.out.println("Ha abierto la caja fuerte.");
			}else{
				System.out.println("Ha agotado las oportunidades.");
			}
		
	
	
		

	}

}
