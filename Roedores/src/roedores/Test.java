package roedores;

import java.util.*;

public class Test {

	public static void main(String[] args) {
	
		List <roedor> roedores = new ArrayList<>();
		
		roedor aguti = new Aguti();
		roedor nutria= new Nutria();
		roedor liebre= new LiebrePantagonica();
		
		roedores.add(aguti);
		roedores.add(nutria);
		roedores.add(liebre);
		
		for (roedor roedor:roedores) {
			System.out.println("Nombre:" + roedor.obtenerNombreRoedor());
			System.out.println("Gestación: " + roedor.gestacion());
			System.out.println("Distribución: " + roedor.distribucion());
	}

}
}