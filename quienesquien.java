package reto_qeq;

import java.util.Random;
import java.util.Scanner;

public class quienesquien {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Random rand=new Random();
	
	//Objetos posibles
	String[] objetos= {"pero", "gato", "pez", "pajaro"};
	
	//Caracteristicas asociadas
	String[][] caracteristicas= {
		{"ladra", "corre","bosteza"}, //perro
		{"maulla","rasca"},//gato
		{"nada", "respira"}, //pez
		{"vuela","canta"}//pajaro
	};
	
	//Elegir obketo al azar
	int indiceAleatorio;
	String objetoAleatorio;
	boolean finalizar=false;
	boolean pregunta=false;
	String palabra;
	
	indiceAleatorio=(int)(Math.random()*objetos.length);
	objetoAleatorio=objetos[indiceAleatorio];
	
	
	System.out.println("--ADIVINA adivinanza--\nHe pensado en un animal. Haz preguntas.");
	System.out.println("Cuando creas saberlo, escribe su nombre");
	
	
	do {
		System.out.println("Dime tu pregunta o intento de acierto: ");
		palabra=sc.nextLine();
		
		sc.nextLine();
		
		if(palabra.equalsIgnoreCase(objetos[indiceAleatorio])) {
			finalizar=true;
			System.out.println("¡Correcto! Era un "+objetos[indiceAleatorio]);
		}
		
		if(palabra.equalsIgnoreCase(caracteristicas[indiceAleatorio][0]) || palabra.equalsIgnoreCase(caracteristicas[indiceAleatorio][1])){
			System.out.println("Si");
	
		}else if (finalizar==false) {
			System.out.println("No");
			
		}
	} while (finalizar==false);
}
}
