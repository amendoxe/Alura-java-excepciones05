package bytebank;

public class SaldoInsuficienteException extends Exception {
//Que está pasando aquí
	// creamos la excepción que extiende de excepción y agregamos
	// un constructor para enviar una string a la clase super (excepción),
	// basicamente estamos creando un custom message para el error que queramos
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
}
