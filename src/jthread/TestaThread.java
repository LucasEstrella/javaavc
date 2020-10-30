package jthread;

public class TestaThread {
	public static void main(String[] args) {
		DesenhaMapa tmapa = new DesenhaMapa();
		Thread tMapa = new Thread(tmapa);
		tMapa.start();
		
		BarraDeProgresso bProg = new BarraDeProgresso();
		Thread tBProg = new Thread(bProg);
		tBProg.start();
	}

}
