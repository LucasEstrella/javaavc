package bibliotecas;

public class TestaMath {

	public static void main(String[] args) {
		int i= -10;
		//System.out.println(i);
		int j = Math.abs(i);
		//System.out.println(j);

		double d1 = 4.15; 
		//System.out.println(d1);
		double d2 = Math.round(d1);
		//System.out.println(d2);
		
		double d3 = 4.5;
		System.out.println(Math.ceil(d3));
		System.out.println(Math.floor(d3));
		System.out.println(Math.round(d3));
						
		
		System.out.println((int)(Math.random()*11));//Gera um número aleatório na faixa escolhida(+1). 
		System.out.println(Math.max(5, 32));// Retorna o maior número informado.
		System.out.println(Math.min(3.14, 1.38));//Retorna o menor número informado.
		System.out.println(Math.ceil(37.6));//Arredonda valor, sempre para cima, pensando em plano cartesiano.
		System.out.println(Math.floor(3.9));//Arredonda sempre para baixo.
		System.out.println(Math.exp(5));
		System.out.println(Math.log(4.5));
		System.out.println(Math.pow(5,2));//Potênciação, eleva o primeiro número com a potência do segundo.
		System.out.println(Math.sqrt(121));// Raiz Quadrada.
		System.out.println(Math.sin(360));
		//System.out.println(Math.toDegrees(angded));
		//System.out.println(Math.toRadians(angdeg));
		
		
//Para Casa: Obs: depois subir para o Github
	//	Implementar classes de testes para os seguintes métodos de Math
	//	usar e depois como comentário explicar
	//	O que faz : random, max, min, ceil, floor, exp, log, pow 
	// sqrt, sin, toDegrees, to Radians.	
	}
}
