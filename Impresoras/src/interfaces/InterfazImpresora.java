package interfaces;



/**
 * Interfaz que modela el comportamiento de los fabricantes de impresoras
 * 
 */
public interface InterfazImpresora {
	
	/**
	Retornará un String con el texto a imprimir precedido de la cadena: "Texto a imprimir en la impresora indicando el fabricante correspondiente:"
	@param textoAImprimir el texto que se acompañará al prefijo indicado
	@return El texto a imprimir junto con el texto que precede ("Texto a imprimir...").
	**/
	public String imprimir(String textoAImprimir);
	
	
	
	/**       
	Retornará un String con el texto a imprimir precedido de la cadena: "Texto a copiar por la impresora XXX"       
	@param textoACopiar el texto que se acompañará al prefijo indicado       
	@return El texto a copiar junto con el texto que precede ("Texto a copiar...").
	**/
	public String copiar (String textoACopiar);
	
	
	
	/**       
	Retornará un String con el texto a escanear precedido de la cadena: "Texto a escanear en la impresora XXX:"       
	@param textoAEscanear el texto que se acompañará al prefijo indicado      
	@return El texto a imprimir junto con el texto que precede ("Texto a escanear...").**/
	public String escanear(String textoAEscanear);
	

}
