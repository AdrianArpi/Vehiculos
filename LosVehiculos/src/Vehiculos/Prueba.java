package Vehiculos;

public class Prueba {

	
	public void ver(){
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		Vehiculo adr=new Vehiculo("4");
		
		System.out.println("El vehiculo tiene " + adr.getNumRuedas() + " ruedas");
		
		System.out.println();
		
		Camion rat=new Camion((byte) 5);
		System.out.println(rat.setNumeroEjes());
		
		Motocicleta mot=new Motocicleta((byte) 6);
		System.out.println(mot.getColor());

	}

}
