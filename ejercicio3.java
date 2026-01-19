package recuperacion;

import java.util.Scanner;

public class ejercicio3 {

	  public static String conviertePalabras(int n) {
	        String[] palabras = {"cero", "uno", "dos", "tres", "cuatro","cinco", "seis", "siete", "ocho", "nueve"};

	        if (n == 0) {
	            return palabras[0];
	        }
	        String numero = String.valueOf(n);
	       
	        for (int i = 0; i < numero.length(); i++) {
	            char c = numero.charAt(i);
	            int digito = c; 
	            
	        }
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  System.out.println("Introduce un número para convertirlo a palabras:");
	        int num = sc.nextInt();
	        //de numero a palabra
	        System.out.println("En palabras: " + conviertePalabras(num));

	}
}
