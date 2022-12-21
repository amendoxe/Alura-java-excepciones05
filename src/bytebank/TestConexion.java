package bytebank;

public class TestConexion {
	public static void main(String[] args) throws Exception {
		try (Conexion con = new Conexion()) {
			con.leerDatos();
		} catch (IllegalStateException e) {
			System.out.println("Surgió un error en la conexion");
		}
	}
}
