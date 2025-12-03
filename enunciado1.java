package examen_ud3;

public class enunciado1 {
	public static void main(String[] args) {
	
	
	//Devuelve un DNI introducido por teclado. Lanza una excepción propia DNIInvalidoException si
	//el formato del DNI es incorrecto
	String leerDNI();
     
	System.out.println("Introduce el DNI(8 números y una letra): ");
	String dni;
	String valido;
	valido=dni.matches("^\\\\d{8}[A-Z]$");
	
	if(leerDNI==!valido ) {
	System.out.println("Error: Fromato de DNI inválido. Debe ser 8 números y una letra");
	}
	     
	
		
	 
	  
	
	
	}
	
	
	//Cambia el dígito en la posición indicada por un nuevo valor, y pone la letra en mayúscula.
	//Lanza una excepción propia DNIInvalidoException si la posición no está en el rango (1..8) o el
	//nuevo valor no es un dígito numérico.
	String cambiarDigito(String dni, int posicion, char nuevoValor){
		
	}
	
	
}