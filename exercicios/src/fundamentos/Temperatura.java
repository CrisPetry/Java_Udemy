package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		
		double F = 86;
		final int ajuste = 32;
		final double fator = 5.0 / 9.0;
		double C;
		
		C = (F - ajuste) * fator;
		
		System.out.println("A temperatura �: " + C + "�C");
		
	}
}
