package bytebank;

public abstract class Cuenta {

	protected double saldo;
	private int agencia = 1;
	private int numero;
	private Cliente titular = new Cliente();

	private static int total;

	public Cuenta() {

	}

	public Cuenta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estoy creando una cuenta " + this.numero);

		Cuenta.total++;
		// sdf
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

// cambiamos de boolean a void porque obtendremos un mensaje customizado dependiendo de lo que ocurra en el método
	// en lugar de obtener un boolean
	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo; " + this.saldo + ", Valor " + valor);
		}
		this.saldo -= valor;
	}

	public void transfiere(double valor, Cuenta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia > 0) {
			this.agencia = agencia;
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero > 0) {
			this.numero = numero;
		}
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return Cuenta.total;
	}

}
