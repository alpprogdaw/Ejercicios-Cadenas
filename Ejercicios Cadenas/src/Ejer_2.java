import java.util.Scanner;

public class Ejer_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		String cadena_inversa = new String();
		String cadena = null; //es lo mismo que new String()
		
		System.out.println("Introduzca una cadena de caracteres: ");
		cadena = in.nextLine();
		
		for (int i = cadena.length()-1; i >= 0; i--) {
			cadena_inversa = cadena_inversa + cadena.charAt(i);
		}
		System.out.println("Cadena = " + cadena + "\nCadena Inversa = " + cadena_inversa);
		in.close();
	}

}
