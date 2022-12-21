package bytebank;

public class TestSacar {
	public static void main(String[] args) {

		Cuenta cuenta = new CuentaCorriente(123, 456);

		cuenta.deposita(200);
		try {
			cuenta.saca(201);
		} catch (SaldoInsuficienteException e) {
			System.out.println("Excepcion: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println(cuenta.getSaldo());
	}
}
