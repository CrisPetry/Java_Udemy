package fundamentos;

public class DesafioOperadorAritmetico {

	public static void main(String[] args) {
		
		/*int a = 3 * 4;
		int b = (int) Math.pow(a, 2);
		
		System.out.println(a);
		System.out.println(b);*/
		
		int a = 6; 
		int b = 3 + 2;
		int c = 3 * 2; 
		int d = 1 - 5;
		int e = 2 - 7;
		int g = 10;
		
		int primeiraSoma = (a * b);
		primeiraSoma = (int) (Math.pow(primeiraSoma, 2)/c);
		
		int segundaSoma = ((d * e)/2);
		segundaSoma = (int) (Math.pow(segundaSoma, 2));
		
		int dividendo = (int) Math.pow(g, 3);
		
		int SomaFinal = (primeiraSoma - segundaSoma);
		
		SomaFinal = (int) Math.pow(SomaFinal, 3);
		
		SomaFinal = SomaFinal/dividendo;
		
		System.out.println(primeiraSoma);
		System.out.println(segundaSoma);
		System.out.println(SomaFinal);
	}
}
