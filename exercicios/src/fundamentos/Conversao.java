package fundamentos;

import javax.swing.JOptionPane;
public class Conversao {

	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Digite o valor 1:");
		String valor2 = JOptionPane.showInputDialog("Digite o valor 2:");
		
		System.out.println(valor1 + valor2);
		
		double num1 = Double.parseDouble(valor1);
		double num2 = Double.parseDouble(valor2);
		
		double soma = num1 + num2;
		double media = (num1 + num2)/2; 
		System.out.println(soma);
		System.out.println(media);
	}
}
