package bibliotecas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeStringTeclado {

	public static void main(String[] args) {
		System.out.println("Digite uma palavra: ");
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		//BufferedReader sabe receber varios char's e armazena-los num Buffer, transformando-os em String
		String s = null;
		try {
			s = br.readLine();
	} catch (IOException e) {
		e.printStackTrace();
	}
		System.out.println("Voc� digitou a frase: "+s);
	}
}
