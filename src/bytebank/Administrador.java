package bytebank;

public class Administrador extends Funcionario implements Autenticable {

	private String clave;
	private AutenticacionUtil autenticador;

	public Administrador() {
		this.autenticador = new AutenticacionUtil();

	}

	@Override
	public double getBonificacion() {
		return this.getSalario();
	}

	@Override
	public void setClave(String clave) {
		this.autenticador.setContraseña(clave);
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.autenticador.autenticar(clave);
	}

}
