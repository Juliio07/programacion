package recuperacion;

import java.util.Scanner;

public class ejercicio1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int reservas=0;
	final int completo=5;
	
	do {
		for(int i=1;i<5;i++) {//Bucle para que se repita la opcion de que te de a elegir entre 1-3
	System.out.println("Elija una de las opciones: ");
	int restaurante=sc.nextLine().charAt(0);
	
	switch(restaurante) {//Aqui elegimos que opcion queremos ver del restaurante.
	case '1':
		System.out.println("Reservar una mesa");
			for(int j=0;j<1;j++) {
				if(reservas==completo) {//si las reservas legan a 5 no se podra pedir mas mesas
					System.out.println("No quedan mesas libres, Prueba otro día!!");
				}else // si sigue habiendo te pedira lo siguiente
				System.out.println("Número de teléfono: ");
				int tlf=sc.nextInt();
				
				System.out.println("Nombre: ");
				String nombre=sc.next();
				
				System.out.println("Duración estimada de la reserva: ");
				double tiempo=sc.nextDouble();
				
				System.out.println("Numero de comensales: ");
				int comensales=sc.nextInt();
				
				System.out.println("Intoleracias alimenticias?: ");
				boolean intolerancia=false;
				
				System.out.println("Hay fumadores?(S/N): ");
				char fuma='S' | 'N';
				
				
				reservas++;
				
				double media=(double) comensales/reservas;
				
				System.out.println("Total mesas reservadas: "+reservas+"\nQuedan "+(5-reservas)+" mesas disponibles.");
				System.out.println("Total de comensales por noche: "+comensales);
				System.out.println("Media de comensales: "+media);
				System.out.println("Fumadores: "+fuma);
			}
	
		break;
	case '2':
		System.out.println("Consultar datos estadisticos de la reserva");
		break;
	case '3':
		System.out.println("Finalizar");
		break;
	default:
		System.out.println("Opcion incorrecta!");
		return;	
	}	
   }

	}while(reservas!=completo);//Se ejecutara mientras las reservas no esten completas
		 
		
	
	
	

}
}
