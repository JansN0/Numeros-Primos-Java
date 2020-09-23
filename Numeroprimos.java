package xd;
import java.util.Scanner;						//libreria de Scanner

public class Numeroprimos {

	public static void main(String[] args) {
		int factor;
		Scanner xd = new Scanner(System.in);					//en esta linea llamamos a "xd" variable que entra mediante el scanner
		System.out.println("Numero que desea descomponer");		//Imprimimos un mensaje para que la persona ingrese el numero
		int numero = xd.nextInt();								//la variable que entro se registra como un entero "Numero"
		
		for (factor=2; factor<=numero; factor++) {				//factor empieza en 2 en cada while mientras sea divisible en 2
			while (numero%factor==0) {
				System.out.println(numero + " | " + factor);	//Se imprime cada resultado dentro del ciclo
				numero/=factor;
			}
		}

	}

}
