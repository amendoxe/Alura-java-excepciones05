package bytebank;

public class Conexion implements AutoCloseable {

	public Conexion() {
		System.out.println("Abriendo conexión");
	}

	public void leerDatos() {
		System.out.println("Recibiendo datos");
		throw new IllegalStateException();

	}

	public void cerrarConexion() {
		System.out.println("Cerrando conexión");
	}

	@Override
	public void close() throws Exception {
		cerrarConexion();
	}
}
