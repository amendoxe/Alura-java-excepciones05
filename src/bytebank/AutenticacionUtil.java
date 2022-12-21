package bytebank;

public class AutenticacionUtil {
	private String clave;

	public void setContraseña(String clave) {
		this.clave = clave;
	}

	public boolean autenticar(String clave) {
		return this.clave == clave;
	}

}
