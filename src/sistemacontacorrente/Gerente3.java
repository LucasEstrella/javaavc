package sistemacontacorrente;

public class Gerente3 extends FuncionarioEspecial{
	int senha;
	
	double getBonus() {// 5% que é bonus + 5000 para o gerente			
		//return this.salario * 0.05 + 5000;
		//melhorar a minha manutenibilidade chamando o recurso da classe pai
		//ou super classe: palavra reservada "super"
		//return super.getBonus() + 5000;
		return super.getSalario() *0.05 + 5000;
	}//aplicamos polimorfismo _> pode ter comportamentos diferentes.
	
//	public boolean verifica(int senha) {
//		if(this.senha == senha) {
//			System.out.println("Acesso autorizado!!!");
//			return true;
//		}else {
//			System.out.println("Acesso não autorizado!!!");
//			return false;
//		}
//	}
	boolean verifica (String senha) {
		return false;
	}
}