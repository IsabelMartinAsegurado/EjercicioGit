package implementaciones;

import interfaces.InterfazImpresora;

	
public class Canon extends Impresora implements InterfazImpresora{
	
	//Atributos de la clase
	private int num_toners;
	
	
	/**
	 * Constructor para crear un objeto de tipo Canon con todos sus parámetros
	 * @param Marca
	 * @param Modelo
	 * @param Tipo
	 * @param num_toners
	 */
	
	
	//Constructores
	public Canon (String marca, String modelo, String tipo, int num_toners) {
		super (marca, modelo, tipo);
		this.num_toners=num_toners;
	}
	
	
	//Métodos
	/**
	Retornará un String con el texto a imprimir precedido de la cadena: "Texto a imprimir en la impresora indicando el fabricante correspondiente:"
	@param textoAImprimir el texto que se acompañará al prefijo indicado
	@return El texto a imprimir junto con el texto que precede ("Texto a imprimir...").
	**/
	public String imprimir(String textoAImprimir) {
	    return "Texto a imprimir por la impresora Canon:"+textoAImprimir;
	
	}
	
	
	/**       
	Retornará un String con el texto a imprimir precedido de la cadena: "Texto a copiar por la impresora ..."       
	@param textoACopiar el texto que se acompañará al prefijo indicado       
	@return El texto a copiar junto con el texto que precede ("Texto a copiar...").
	**/
	public String copiar (String textoACopiar) {
		return "Texto a copiar por la impresora Canon:"+textoACopiar;
	}
	
	
	
	/**       
	Retornará un String con el texto a escanear precedido de la cadena: "Texto a escanear en la impresora ...:"       
	@param textoAEscanear el texto que se acompañará al prefijo indicado      
	@return El texto a imprimir junto con el texto que precede ("Texto a escanear...").**/
	public String escanear(String textoAEscanear) {
		return "Texto a escanear por la impresora Canon:"+textoAEscanear;
	}
	
	/**
	 * Devuelve el número de toners de la impresora
	 * @return the num_toners
	 */
	
	public int getNum_toners() {
		return this.num_toners;
	}
	
	
	/**
	 * Asigna el número de toners de la impresora
	 * @param num_toners the num_toners to set
	 */
	
	public void setNum_toners(int num_toners) {
		this.num_toners= num_toners;
	}
	

	/**
	 * Sobreescribimos el método toString 
	 * @return un String con todos los datos de este fabricante 
	 */
	public String toString() {
		return super.toString()+", Número de tóners:"+ this.num_toners;
		
	}

}
