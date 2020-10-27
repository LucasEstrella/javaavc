package bibliotecas;

public class TesteEquals {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		
		if (i == j) {
			System.out.println("i e j são iguais");
		}else {
			System.out.println("i e j são diferentes");
		}
		
		String c = new String("Senac 456");
		String d = new String("Senac 456");
		if (c == d) {
			System.out.println("c e d são iguais");
		}else {
			System.out.println("c e d são diferentes");
		}
		
		//equals() e toString() são os metodos mais importantes de Object
		if(c.contentEquals(d)) {
			System.out.println("As String c e d possuem o mesmo conteudo");
		}else {
			System.out.println("As Strings c e d ´possuem conteudos diferentes");
		}
	}

}
