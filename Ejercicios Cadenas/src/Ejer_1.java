import java.util.Scanner;

public class Ejer_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		String cadena;
		cadena = in.nextLine();
		
		int cont_a = 0;
		int cont_e = 0;
		int cont_i = 0;
		int cont_o = 0;
		int cont_u = 0;
		
		for (int i=0; i < cadena.length(); i++) {
			if (cadena.charAt(i)== 'a') {
				cont_a++;
			}
			if (cadena.charAt(i)== 'e') {
				cont_e++;
			}
			if (cadena.charAt(i)== 'i') {
				cont_i++;
			}
			if (cadena.charAt(i)== 'o') {
				cont_o++;
			}
			if (cadena.charAt(i)== 'u') {
				cont_u++;
			}
		}
		System.out.println("Veces que se repite a " + cont_a +
				"\nVeces que se repite e " + cont_e + "\nVeces que se repite i " +
				cont_i + "\nVeces que se repite o " + cont_o + "\nVeces que se repite u " + cont_u);
		

	}

}
