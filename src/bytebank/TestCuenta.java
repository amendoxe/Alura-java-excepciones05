package bytebank;

public class TestCuenta {

	public static void main(String[] args) throws SaldoInsuficienteException {
		CuentaCorriente cc = new CuentaCorriente(1, 1);
		cc.deposita(100);
		System.out.println(cc.getSaldo());

		CuentaAhorros ca = new CuentaAhorros(2, 3);
		cc.deposita(200);
		cc.transfiere(100, ca);

		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());
	}

}
