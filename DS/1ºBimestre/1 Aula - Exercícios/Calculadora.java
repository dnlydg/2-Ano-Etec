package Calculadora;

public class Calculadora {

	double n1;
	double n2;
	double r;
	String operacao;
	
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
