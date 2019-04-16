package Vehiculos;
/**
 * @author Adrian Arpi
 * @version v1-2019
 * @since 16/04/2019
 * 
 */
public class Motocicleta extends Vehiculo{
	
/**
 * Primer operando privado
 */
	private byte numeroPlazas;
	
/**
 * Primer constructor
 * @param numPlazas
 * Obtedremos el numero de plazas
 */
	public Motocicleta (byte numPlazas)
	{
		super(numPlazas);
		super.setNumeroRuedas((byte) 2);
	}
	
/**
 * Segundo constructor
 * @param color
 * Obtendremos el color de la Motocicleta
 */
	public Motocicleta (String color)
	{
		super(color);
		super.setNumeroRuedas((byte) 2);
	}
	
/**
 * Tercer constructor
 * @param color
 * @param cilin
 * Obtendremos  color y cilindrada
 */
	public Motocicleta (String color,byte cilin)
	{
		super(color, cilin);
		super.setNumeroRuedas((byte) 2);
	}
	
/**
 * Cuarto constructor
 * @param color
 * @param cilin
 * @param poten
 * Obtendremos color, cilindrada y potencia
 */
	public Motocicleta (String color,byte cilin,short poten)
	{
		super(color,cilin,poten);
		super.setNumeroRuedas((byte) 2);
	}
	
/**
 * Primer metodo
 * @return numeroPlazas
 * Se obtiene el numero de clases
 */
	public byte getNumeroPlazas()
	{
		return numeroPlazas;
	}
	
/**
 * Segundo metodo 
 * @param num
 * Declara el numero de plazas
 */
	public void setNumeroPlazas(byte num)
	{
		numeroPlazas=num;
	}


}
