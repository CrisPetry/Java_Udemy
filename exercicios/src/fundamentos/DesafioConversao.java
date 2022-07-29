package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Qual o primeiro salário?");
		String valor1 = teclado.nextLine().replace(",", ".");

		System.out.print("Qual o segundo salário?");
		String valor2 = teclado.nextLine().replace(",", ".");

		System.out.print("Qual o terceiro salário?");
		String valor3 = teclado.nextLine().replace(",", ".");

		double num1 = Double.parseDouble(valor1);
		double num2 = Double.parseDouble(valor2);
		double num3 = Double.parseDouble(valor3);

		double media = (num1 + num2 + num3) / 3;

		System.out.println(media);

		teclado.close();
	}
}
