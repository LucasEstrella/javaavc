package sistemacontacorrente;

public class Gerente2 extends Funcionario2{
	int senha;
	
//	double getBonus() {// 15% do sal�rio para o gerente
//		return this.salario * 0.15;
//}
	public boolean verifica(int senha) {
		if(this.senha == senha) {
			System.out.println("Acesso autorizado!!!");
			return true;
		}else {
			System.out.println("Acesso n�o autorizado!!!");
			return false;
		}
	}

	@Override
	double getBonus() {
		// TODO Auto-generated method stub
		return 0;
	}
}