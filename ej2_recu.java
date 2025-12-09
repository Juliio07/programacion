package examen_recuperacion;

import java.util.Scanner;

public class ej2_recu {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int numeroSecreto=(int)(Math.random()*25)+1;//la maquina me va a calcuar un numero aleatorio entre el 1 y el 25 
	boolean acierto;
	int veces=0;
	
	System.out.println("¿Cuantos intentos quieres realizar?: ");
	int intentos=sc.nextInt();
	for(int i=1;i<veces;i++) {
	intentos++;
	}
   System.out.println("¿Quieres recibir ayuda?(S/N): ");
	int ayuda=sc.nextInt();
    char S  ;
	char N  ;
	switch (ayuda) {
	case 1:
		ayuda=S;
		break;
	case 2:
	     ayuda=N;
	     break;
	     
	}
	
	
	
	System.out.println("Introduce un numero: ");
	int num=sc.nextInt();
	while(ayuda==S) {
		if(num<numeroSecreto) {//si nuestro numero fuera menor o mayor que el secreto, nos lo indicaria como pista al haber elegido antes S
			System.out.println("PISTA: tu numero es menor");
		}else {
			System.out.println("PISTA: tu numero es mayor");
		}
	}
	
	for(int i=1;i<numeroSecreto;i++) {
		
		if(!(num==numeroSecreto)){
		System.out.println("No has acertado.");
		
	}else {
			System.out.println("¡¡¡Has acertado!!! El numero secreto era "+numeroSecreto);
	}
			
	
}
}
}
