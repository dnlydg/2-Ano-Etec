package Calculadora;

import java.util.Scanner;

public class Calculadora {

	double n1;
	double n2;
	double r;
	String operacao;
	
	
	//m�todo que inicia a calculadora, l� os valores e chama o m�todo de c�lculo
	public void iniciar() {
		Scanner in = new Scanner(System.in);
		System.out.println("Iniciando a calculadora...");
		System.out.println("Por favor, digite o 1� valor:");
		n1 = in.nextDouble();
		System.out.println("Agora, digite a opera��o desejada: | / para Divis�o | * para Multiplica��o | - para Subtra��o | + para Adi��o |");
		operacao = in.next();
		System.out.println("Ok, Agora digite o 2� valor:");
		n2 = in.nextDouble();
		calcular(operacao);
	}
	
	//m�todo que faz o calculo
	public void calcular(String operacao){
		if(operacao.contentEquals("/")) {
			r = n1/n2;
			System.out.println("O Resultado da divis�o �: "+r);
		}else if(operacao.contentEquals("*")) {
			r = n1*n2;
			System.out.println("O Resultado da multiplica��o �: "+r);
		}else if(operacao.contentEquals("-")) {
			r = n1-n2;
			System.out.println("O Resultado da subtra��o �: "+r);
		}else if(operacao.contentEquals("+")) {
			r = n1+n2;
			System.out.println("O Resultado da soma �: "+r);
		}
	}
	
}
