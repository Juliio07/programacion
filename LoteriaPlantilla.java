package reto_equipo5;


import java.util.Scanner;
import java.util.random.*;



//Excepción propia
class GordoException extends Exception {
	//COMPLETAR //julio
	public GordoException(String mensaje) {
		super(mensaje); 
		}
     

public class LoteriaPlantilla {	
	
	//devuelve un array de tamaño numBolas con todos los números del sorteo
	public static int[] creaBomboNumeros(int numBolas) {
		//COMPLETAR  //JULIO
		int[] bombo= new int[numBolas];
		int contador=0;
		for(int i=0; i<numBolas;i++ ) {
		boolean repetido=false;
		
		 for (int j = 0; j < contador; j++) {
             if (bombo[j] == numBolas[i]) {
                 repetido = true;
                 break;
             }//Sin repetidos
	}
	}
	}
		
	//devuelve un array de tamaño numPremios con todos los premios del sorteo
	public static String[] creaBomboPremios(int numPremios) {
		String[] bomboPremios = new String[numPremios];
		
		bomboPremios[0]="PRIMER PREMIO";  // gordo de navidad
		bomboPremios[1]="SEGUNDO PREMIO";	// un segundo premio
		
		//COMPLETAR //julio
		
		// un tercer premio
		bomboPremios[2]="TERCER PREMIO";
		
		// dos cuartos premios
        bomboPremios[3]="CUARTO PREMIO";
        bomboPremios[4]="CUARTO PREMIO";
		// 8 quintos premios
       for(int i=5; i<12;i++) {
    	   System.out.println("QUINTO PREMIO");
       }
		// el resto hasta completar 1.807 premios son "pedrea"
		for(int i=12;i<1807;i++) {
			System.out.println("pedrea");
		}
		
		System.out.println("Bombo de premios creado...");
		return bomboPremios;
	}
	
	//devuelve un numero al azar del bombo de números, que será objeto de un premio.
	//Si un número ya ha salido, no debe volver a salir
	public static int dameNumero(int[] bombo) {
		
		int numAgraciado = (int) (Math.random()*bombo.length);

		// si el número ya había salido, generamos otro al azar

		//COMPLETAR
		
		// marcamos el número que ha salido con -1 para que no vuelva a salir
		bombo[numAgraciado]=-1;
		
		//COMPLETAR
		
	}
	
	//devuelve un premio al azar del bombo de premios
	//Si un premio ya ha salido, no debe volver a salir
	public static String damePremio(String[] bombo) {
		
		String premio;
		
		int indicePremiado = (int) (Math.random()*bombo.length);

		// si el premio ya había salido, generamos otro al azar
		//COMPLETAR   //julio
		for(i=0;i<13;i++) {
			boolean repetido=false;
			
		}
	   
	       
	     
		// marcamos el premio que ha salido 
		//COMPLETAR
 				
		return premio;
	}
	
	
	//Comprueba si un décimo ha sido agraciado y en tal caso indica por consola el premio
	//Ejemplo: "Agraciado con: pedrea"
	public static String heSidoAgraciado(String[] numerosSorteo, String[] premiosSorteo, String miDecimo){
		String premio="Número no premiado";//valor por defecto
			
		//COMPLETAR //Julio
   int[] numerosSorteo= {00000, 99999};
   int[] premiosSorteo= {0,13};
   int[] miDecimo= {};
   
   
	
	
	//Implementa un bucle para comprobar, haciendo uso del método heSidoAgraciado, si nuestro décimo tiene o no premio
	// Debe comprobar que se introducen exactamente 5 dígitos entre el 0 y el 9, por ejemplo 04544
	// Al introducir fin, finaliza la comprobación de décimos
	public static void compruebaDecimos(String[] numerosSorteo, String[] premiosSorteo) throws GordoException{
		Scanner sc=new Scanner(System.in);	
		String miDecimo;
		String miPremio="";
		boolean terminarDeComprobar=false;
		boolean numeroValido=false;
		
		System.out.println("\nCOMPROBACION DE DECIMOS:");
		
		//Compruebo si me ha tocado la lotería
		//COMPLETAR
		
		System.out.println("Introduzca los 5 dígitos de su décimo  (fin para terminar");
		
	}
				

	public static void main(String[] args) {
		
		final int MAX_NUMEROS=100000; // números del sorteo
		final int MAX_PREMIOS=1807;   // premios del sorteo
		
		int numeroAgraciado; //número que sale del bombo
		String premio=""; //premio que sale del bombo
		
				
		int[] bomboBolas = new int[MAX_NUMEROS];
		String[] bomboPremios = new String[MAX_PREMIOS];

		String[] listaNumerosSorteo = new String[MAX_PREMIOS]; // lista oficial de números que han salido en el sorteo
		String[] listaPremiosSorteo = new String[MAX_PREMIOS]; // lista oficial de premios que han salido en el sorteo
		
		try {
		
			//Creamos los bombos con sus bolas
			bomboBolas=creaBomboNumeros(MAX_NUMEROS);		
			bomboPremios=creaBomboPremios(MAX_PREMIOS);
			
			//Mostramos el listado completo de números premiados
			System.out.println("\nLISTADO OFICIAL DE PREMIOS:\n");
		
			int j=0;
			for (int i=0;i<MAX_PREMIOS;i++) {
				//Sacamos un número del bombo y lo rellenamos con ceros a la izquierda
				numeroAgraciado=dameNumero(bomboBolas);
				String numeroFormateado=String.format("%05d",numeroAgraciado);
			
				//Sacamos un premio del bombo
				premio=damePremio(bomboPremios);
				
				//Añado el número a la lista oficial del sorteo en la posición j
				listaNumerosSorteo[j]=numeroFormateado;
				
				//Añado el premio a la lista oficial del sorteo en la posición j
				//COMPLETAR
				
				j++;
				
				System.out.println("Numero:"+numeroFormateado+" agraciado con: "+premio);		
			}
		
			compruebaDecimos(listaNumerosSorteo, listaPremiosSorteo);
				
			
		}	//COMPLETAR (capturar excepción propia) //Julio
	
		try {
			LoteriaPlantilla.
		}
		catch (Exception e) {
				System.out.println("Error:"+e.getMessage());
				} finally {
					System.out.println("\nSorteo finalizado");			
				}		
	}
}
}