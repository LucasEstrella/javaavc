package sistemacontacorrente;

public class Conta {
	int numero;
	String nome;
	double saldo;
	double limite;
	
	boolean sacar(double valor) {
	//	double saldoAlterado = saldo - valor;
	//	saldo = saldoAlterado;
	
		// OUTRA OP��O1
	//	saldo = saldo - valor;
	
		// OUTRA OP��O2
	// saldo -= valor;
	
		// OUTRA OP��O3
	//this.saldo -= valor;
		if (valor <= this.saldo + this.limite) {
			this.saldo -= valor;
			return true;
			
		} else {
			return false;
		}
	}
	
	void depositar(double valor) {
		this.saldo += valor;
	}
}
