import java.util.Scanner;

public class Ejercicio_Propuesto {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int n_i = 0;
		int n;
		int resto;
		int aux;
		
		System.out.println("Introduce un numero entero positivo: ");
		n = in.nextInt();
		aux = n;
		
		while (n > 0) {
			resto = n % 10;
			n_i = (n_i * 10) + resto;
			n = n/10;
		}
		System.out.println("El numero " + aux + " invertido es: " + n_i);
		if (aux == n_i) {
			System.out.println("El numero" + aux + "es capicua");
		}
		else {
			System.out.println("El numero " + aux + "no es capicua");
		}
	}
}
