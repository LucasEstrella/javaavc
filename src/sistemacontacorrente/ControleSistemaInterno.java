package sistemacontacorrente;

public class ControleSistemaInterno {
	String senha;
	
	void validaSenha(AcessoInterno funcEsp) {
		funcEsp.verifica(senha);
		//implementação para validação da senha
	}

}
