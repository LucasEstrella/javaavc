package bibliotecas;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeCharTeclado {

	public static void main(String[] args) {
		System.out.println("Digite uma tecla: ");
		InputStream is = System.in;
		//InputStream é a classe Java que sabe capturar um byte
		//Nesse caso, recebendo da entrada padrão do sistema
		InputStreamReader isr = new InputStreamReader(is);
		//ISR sabe receber um byte e transforma-lo em char
		char c = 0;
		try {
			c= (char) isr.read();
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Você digitou a tecla: "+c);
	}

}
