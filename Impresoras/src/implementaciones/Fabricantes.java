package implementaciones;

import java.util.ArrayList;



public class Fabricantes {
	
	/**
	 * Atributo de la clase
	 */
	private ArrayList<Impresora> fabricantes;
	
	
	
	
	/**
	 * Constructor por defecto. Inicializa la estructura de datos
	 */
	public Fabricantes() {
		fabricantes = new ArrayList<Impresora>();
	}
	

	
	/**
	 * Constructor que se le pasa una estructura de datos y se asigna 
	 * a mi atributo de clase 
	 * @param fabricantes
	 */
	public Fabricantes(ArrayList<Impresora> fabricantes) {
		this.fabricantes = fabricantes;
	}
	
	
	
	/**
	 * Añade un fabricante a la lista de fabricantes
	 * @param impr
	 */
	public void addFabricante(Impresora impr) {
		fabricantes.add(impr);
		
	}
	/**
	 * Elimina el elemento Impresora del índice que se pasa como parámetro
	 * @param index
	 */
	public void removeFabricante(int index) {
		fabricantes.remove(index);
	}
	
	
	/**
	 * Método que imprime en pantalla todos los datos de cada uno de los fabricantes
	 * que hay en el ArrayList fabricantes
	 */
	public void listarFabricantes() {
		for (Impresora impr: fabricantes)
			System.out.println("Marca del fabricante:"+impr.getMarca());
			//System.out.println("Todos los datos del fabricante:"+impr.toString());

		/*int size = fabricantes.size();
		Impresora tmp;
		for (int i=0;i<size;i++) {
			tmp = fabricantes.get(i);
			tmp.toString();
		}*/
	}
	
	
	/**
	 * Devuelve el fabricante según el índice
	 * @param index
	 * @return fabricantes
	 */
	public Impresora getFabricante(int index) {
		 return fabricantes.get(index);
	}
	
	
	/**
	 * Devuelve todos los fabricantes
	 * @return fabricantes
	 */
	public ArrayList<Impresora> getAllFabricantes(){
		return this.fabricantes;
	}
	
	

}
