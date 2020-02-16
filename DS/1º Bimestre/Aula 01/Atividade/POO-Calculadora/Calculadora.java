package Calculadora;

import java.util.Scanner;

public class Calculadora {

	double n1;
	double n2;
	double r;
	String operacao;
	
	
	//método que inicia a calculadora, lê os valores e chama o método de cálculo
	public void iniciar() {
		Scanner in = new Scanner(System.in);
		System.out.println("Iniciando a calculadora...");
		System.out.println("Por favor, digite o 1º valor:");
		n1 = in.nextDouble();
		System.out.println("Agora, digite a operação desejada: | / para Divisão | * para Multiplicação | - para Subtração | + para Adição |");
		operacao = in.next();
		System.out.println("Ok, Agora digite o 2º valor:");
		n2 = in.nextDouble();
		calcular(operacao);
	}
	
	//método que faz o calculo
	public void calcular(String operacao){
		if(operacao.contentEquals("/")) {
			r = n1/n2;
			System.out.println("O Resultado da divisão é: "+r);
		}else if(operacao.contentEquals("*")) {
			r = n1*n2;
			System.out.println("O Resultado da multiplicação é: "+r);
		}else if(operacao.contentEquals("-")) {
			r = n1-n2;
			System.out.println("O Resultado da subtração é: "+r);
		}else if(operacao.contentEquals("+")) {
			r = n1+n2;
			System.out.println("O Resultado da soma é: "+r);
		}
	}
	
}
