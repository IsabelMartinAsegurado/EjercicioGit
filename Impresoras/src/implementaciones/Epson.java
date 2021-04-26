package implementaciones;

import interfaces.InterfazImpresora;

public class Epson extends Impresora implements InterfazImpresora{

	//Atributos
	private boolean laser;
	
	//Constructores
	public Epson (String marca, String modelo, String tipo, boolean laser) {
		super (marca, modelo,tipo);
		this.laser=laser;
	}
	
	//Métodos
	
	/**
	Retornará un String con el texto a imprimir precedido de la cadena: "Texto a imprimir en la impresora indicando el fabricante correspondiente:"
	@param textoAImprimir el texto que se acompañará al prefijo indicado
	@return El texto a imprimir junto con el texto que precede ("Texto a imprimir...").
	**/
	public String imprimir(String textoAImprimir) {
	    return "Texto a imprimir por la impresora HP:"+textoAImprimir;
	
	}
	
	
	/**       
	Retornará un String con el texto a imprimir precedido de la cadena: "Texto a copiar por la impresora ..."       
	@param textoACopiar el texto que se acompañará al prefijo indicado       
	@return El texto a copiar junto con el texto que precede ("Texto a copiar...").
	**/
	public String copiar (String textoACopiar) {
		return "Texto a copiar por la impresora HP:"+textoACopiar;
	}
	
	
	/**       
	Retornará un String con el texto a escanear precedido de la cadena: "Texto a escanear en la impresora ...:"       
	@param textoAEscanear el texto que se acompañará al prefijo indicado      
	@return El texto a imprimir junto con el texto que precede ("Texto a escanear...").**/
	public String escanear(String textoAEscanear) {
		return "Texto a escanear por la impresora HP:"+textoAEscanear;
	}
	
	/**
	 * Devuelve si tiene laser o no a la impresora
	 * @return the laser
	 */
	public boolean getLaser() {
		return this.laser;
	}
	
	/**
	 * Asigna si tiene laser o no la impresora
	 * @param laser the laser to set
	 */
	public void setLaser(boolean laser) {
		this.laser=laser;
	}
	
	
	/**
	 * Sobreescribimos el método toString
	 * @return un String con todos los datos de este fabricante
	 */
	public String toString() {
		return super.toString()+"¿Láser?:"+this.laser;
	}

}
