package bibliotecas;

public class TestaMath {

	public static void main(String[] args) {
		int i= -10;
		System.out.println(i);
		int j = Math.abs(i);
		System.out.println(j);

		double d1 = 4.15; 
		System.out.println(d1);
		double d2 = Math.round(d1);
		System.out.println(d2);
		
		double d3 = 4.5;
		System.out.println(Math.ceil(d3));
		System.out.println(Math.floor(d3));
		System.out.println(Math.round(d3));
		
	}
}
