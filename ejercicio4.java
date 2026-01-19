package recuperacion;

import java.util.Scanner;

public class ejercicio4 {
	
	   public static int maxMatriz(int[][] matriz) {
		Scanner sc=new Scanner(System.in);
		
		int max=matriz[0][0];
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				if(matriz[i][j]>max) {
					max=matriz[i][j];
				}
			}
		}
		return max;
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		//Pedimos al usuario que introduzca el numero de filas y columnas
		 System.out.println("Introduce número de filas de la matriz:");
	        int filas = sc.nextInt();
	        
	        System.out.println("Introduce número de columnas de la matriz:");
	        int columnas = sc.nextInt();

	        int[][] matriz = new int[filas][columnas];

	        // Se rellena con numeros aleatorios entre 0 y 1000
	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                matriz[i][j] = (int) (Math.random() * 1001); // Asi se genera el numero aleatorio
	            }
	        }

	        // Mostrar matriz
	        System.out.println("---Matriz generada---");
	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                System.out.print(matriz[i][j] );
	            }
	            System.out.println();
	        }

	        int max = maxMatriz(matriz);
	        System.out.println("El valor máximo de la matriz es: " + max);//Nos mostrara el valor mas alto de la matriz 

	        sc.close();
	}
	
}
