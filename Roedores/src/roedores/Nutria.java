package roedores;

public class Nutria implements roedor{

	@Override
	public String obtenerNombreRoedor() {
		return "NUTRIA";
	}

	@Override
	public String gestacion() {
		return "128-140 D�as";
	}

	@Override
	public String distribucion() {
		return "Brasil, Paraguay, Uruguay, Bolivia, Argentina y Chile";
	}

}
