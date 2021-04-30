package roedores;

public class Aguti implements roedor{

	@Override
	public String obtenerNombreRoedor() {
		return "AGUTÍ";
	}

	@Override
	public String gestacion() {
		return "3.5 - 4 Meses";
	}

	@Override
	public String distribucion() {
		return "los bosques Tropicales";
	}

}
