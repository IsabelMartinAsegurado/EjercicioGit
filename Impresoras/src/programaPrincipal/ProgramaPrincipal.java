package programaPrincipal;

import java.util.ArrayList;

import implementaciones.Fabricantes;
import implementaciones.Impresora;
import implementaciones.Canon;
import implementaciones.Constantes;
import implementaciones.HP;
import implementaciones.Epson;


public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		//Creo el objeto
		Fabricantes fabricantes= new Fabricantes();
		
		//Introduzco los valores
		Impresora canon = new Canon("Canon", "C-001", Constantes.BLANCONEGRO, 2);
		Impresora hp = new HP ("HP", "DJ231", Constantes.COLOR, true);
		Impresora epson = new Epson("Epson", "EP-451", Constantes.BLANCONEGRO, false);
		
		//Los añado al array
		fabricantes.addFabricante(canon);
		fabricantes.addFabricante(hp);
		fabricantes.addFabricante(epson);
		
		
		Impresora tmp = fabricantes.getFabricante(1);
		System.out.println("Datos del fabricante 1:"+tmp.toString());
		
		ArrayList<Impresora> arraylist2 = fabricantes.getAllFabricantes();
		for (Impresora impr : arraylist2)
			System.out.println("Datos de todos los fabricantes:"+impr.toString());
	}

}
