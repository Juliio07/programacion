package examen_recuperacion;

import java.util.Scanner;

public class ej1_recu {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int cargo = 0;
	int tester = 0;
	int programador = 0;
	int analista = 0 ;
	
	
	System.out.println("Introduce el cargo del empleado");
	
	
	//Para elegir el cargo del empleado hacemos un switch
	switch (cargo){
	case 1:
		cargo=tester;
		break;
	case 2:
		cargo=programador;
		break;
	case 3:
		cargo=analista;
		break;		
		
	}
	System.err.println("---NÓMINA DEL EMPLEADO---");
	int sueldobase=1200;
	for(int i=0;i<1;i++) {
		if(cargo==tester) {
			System.out.println("Sueldo base= "+sueldobase+"euros");//sueldo de tester
		}
		if(cargo==programador) {
			System.out.println("Sueldo senior= "+(sueldobase+300)+"euros");//le sumamos 300 euros al sueldo de un tester
			
		}
		if(cargo==analista) {
			System.out.println("Sueldo= " +sueldobase*2+"euros");// se multipliquica por 2 el sueldo de un tester
		}
	}
	
	int viaje=0;
	int dietas=0;
	System.out.println("Introduce los dias visitando clientes");
	
	if(viaje>20) {
		System.out.println("Error. Los dias de viaje deben estar entre 1 y 20");
		viaje++;
	}
	else {	
	for(int i=1;i<=20;i++){
		if(viaje==1) {
			System.out.println("Dietas "+(dietas+30));//por cada dia de viaje se suman 30 euros de dietas
			dietas++;
		}
	}
	}
	System.out.println("Sueldo bruto: "+(sueldobase+dietas));
	int estadocivil = 0;
	int S=0;
	int C=0;
	
	switch(estadocivil) {
	case 1:
		estadocivil=S;
		break;
	case 2:
		estadocivil=C;
		break;
		
	}
	System.out.println("Introduce el estado civil (S/C)");
	
	if(estadocivil==S) {
		System.out.println("Retención IRPF: "+(sueldobase+dietas)*25/100);//se le resta un 25% del irpf al sueldo bruto si esta soltero
	}
	else if(estadocivil==C){
		System.out.println("Retención IRPF: "+(sueldobase+dietas)*20/100);//si esta casado se le resta un 20%
	}
		
		
	

}
	
	
}
