package act2;

public class pila {

	private int[] apilar;
	private int cima;
	
	pila(int capacidad){
		this.apilar=new int[capacidad];
		this.cima=-1;
	}
	
	public void apilar(int num) {
		if(cima<apilar.length) {
			cima++;
			apilar[cima]=num;
			System.out.println(num);
		}else {
			System.out.println("Sobrepasaste el tope.");
		}
			
	}
	
	public void desapilar(int num) {
		if(cima>0) {
			num=apilar[cima];
			cima--;
		}else {
			System.out.println("No tienes nada para poder sacar.");
		}
	}
	
	public int mostrarcima() {
		if(cima>=0) {
		return apilar[cima];
		}else {
		System.out.println("Esta vacía");
		return cima;
		}
	}
}
