package bibliotecas;

public class TesteEquals {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		
		if (i == j) {
			System.out.println("i e j s�o iguais");
		}else {
			System.out.println("i e j s�o diferentes");
		}
		
		String c = new String("Senac 456");
		String d = new String("Senac 456");
		if (c == d) {
			System.out.println("c e d s�o iguais");
		}else {
			System.out.println("c e d s�o diferentes");
		}
		
		//equals() e toString() s�o os metodos mais importantes de Object
		if(c.contentEquals(d)) {
			System.out.println("As String c e d possuem o mesmo conteudo");
		}else {
			System.out.println("As Strings c e d �possuem conteudos diferentes");
		}
	}

}