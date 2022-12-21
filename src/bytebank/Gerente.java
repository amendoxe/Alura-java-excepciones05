package bytebank;

//                  extiende de
public class Gerente extends Funcionario implements Autenticable {
	private AutenticacionUtil autenticar;

	public Gerente() {

		this.autenticar = new AutenticacionUtil();

	}

	// Sobre-escritura de metodo
	public double getBonificacion() {
		System.out.println("EJECUTANDO DESDE GERENTE");
		return 2000;
	}

	@Override
	public void setClave(String clave) {
		this.autenticar.setContraseña(clave);
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.autenticar.autenticar(clave);
	}
}
