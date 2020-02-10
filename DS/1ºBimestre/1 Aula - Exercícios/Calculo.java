package Calculadora;

import java.util.Scanner;

public class Calculo {

	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
		Calculadora calculo = new Calculadora();
		calculo.n1 = in.nextDouble();
		calculo.operacao = in.next();
		calculo.n2 = in.nextDouble();
		calculo.calcular(calculo.operacao);
		
		
	}
	
}
