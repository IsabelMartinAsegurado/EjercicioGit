package implementaciones;

public class Impresora {
	
	//Atributos de la clase
	
	private String marca;
	private String modelo;
	private String tipo;
	
	
	//Constructores
	/**
	 * Constructor con todos los parámetros
	 * @param marca Marca de la impresora
	 * @param modelo Modelo de la impresora
	 * @param tipo Tipo de la impresora
	 */
	
	public Impresora(String marca,String modelo, String tipo) {
		this.marca=marca;
		this.modelo=modelo;
		this.tipo=tipo;
	}
	
	
	//Métodos
	
	/**
	 * Devuelve la marca de la impresora
	 * @return the marca
	 */
	
	public String getMarca() {
		return this.marca;
	}
	
	
	/**
	 * Asigna la marca de la impresora
	 * @param marca the marca to set
	 */
	
	public void setMarca(String marca) {
		this.marca= marca;
	}
	
	/**
	 * Devuelve el modelo de la impresora
	 * @return the modelo
	 */

	public String getModelo() {
		return this.modelo;
	}
	
	/**
	 * Asigna un modelo de impresora
	 * @param modelo the modelo to set
	 */
	
	public void setModelo(String modelo) {
		this.modelo=modelo;
	}
	
	/**
	 * Devuelve el tipo de la impresora
	 * @return the tipo
	 */
	public String getTipo() {
		return this.tipo;
	}
	
	
    /**
     * Asigna el tipo a la impresora
     * @param tipo the tipo to set
     */
	public void setTipo(String tipo) {
		this.tipo=tipo;
	}
	
	/**
	 * Sobreeescribimos el método toString para mostrar todos los atributos de la clase
	 * @return un String con los valores de los atributos
	 */
	@Override
	public String toString () {
		return "Marca:"+getMarca()+"Modelo:"+getModelo()+"Tipo:"+getTipo();
	}
	
	
	//public String toString() {
		//return "Marca:"+this.marca+"Modelo:"+this.modelo+"Tipo:"+this.tipo;
	//}
}