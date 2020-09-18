package sistemacontacorrente;

public class TestaConta {

	public static void main(String[] args) {
		//Conta c1; // Declaração da variavel c1 do tipo Conta
		//c1 = new Conta(); // Instanciação do Objeto
		
		//Declaração e instanciação na mesma linha
		Conta c1 = new Conta();
		
		//inicializar os atributos com o operador "."
		c1.numero = 001;
		c1.nome = "Lucas";
		c1.saldo = 1000;
		c1.limite = 500;
		
		System.out.println("Numedo da Conta: "+c1.numero);
		System.out.println("Titular da Cnta: "+c1.nome);
		System.out.println("Saldo atual: "+c1.saldo);
		System.out.println("Limite: "+c1.limite);
		
	//	double valor = 5000;
	//	boolean result = c1.sacar(valor);
	//	if(result) {
	//		System.out.println("Você sacou R$" +valor");
	//	}else {
	//		System.out.println("Limite acima do possível!!!");
	//	}
		
	//	c1.sacar(5000);
	//	System.out.println("Saldo Atual: "+c1.saldo);
		
		if(c1.sacar(80)) {
			System.out.println("Saque realizado com sucesso");
		}else {
			System.out.println("Limite acima do possível");
		}
		
		c1.depositar(1000);
		System.out.println("Saldo Atual: "+c1.saldo);
	}

}
