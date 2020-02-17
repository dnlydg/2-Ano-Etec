package Calculadora;

import java.util.Scanner;

public class Calculadora {

	Scanner in = new Scanner(System.in);
	
	double numero1;
	double numero2;
	double resultado;
	String operacao;
	
	
	//m�todo que inicia a calculadora, l� os valores e chama o m�todo de c�lculo
	public void iniciar() {
		
		System.out.println("Iniciando a calculadora...");
		System.out.println("Por favor, digite o 1� valor:");
		numero1 = in.nextDouble();
		System.out.println("Ok, Agora digite o 2� valor:");
		numero2 = in.nextDouble();
		selecionarOperacao();
	}
	
	//m�todo que seleciona a opera��o
	public void selecionarOperacao() {
		System.out.println("Agora, digite a opera��o desejada: ");
		System.out.println("| / para Divis�o | * para Multiplica��o | - para Subtra��o | + para Adi��o |");
		operacao = in.next();
		switch(operacao){
		
		case("/"):
			dividir();
			break;
		case("*"):
			multiplicar();
			break;
		case("-"):
			subtrair();
			break;
		case("+"):
			somar();
			break;
		default:
			System.out.println("Opera��o Inv�lida");
			break;
		}
	}
	
	//m�todo que multiplica 
	public void multiplicar() {
		resultado=numero1*numero2;
		apresentar();
	}
	
	//m�todo que divide
	public void dividir() {
		resultado=numero1/numero2;
		apresentar();
	}
	
	//m�todo que subtrai
	public void subtrair() {
		resultado=numero1-numero2;
		apresentar();
	}
	
	//m�todo que soma
	public void somar() {
		resultado=numero1+numero2;
		apresentar();
	}
	
	//m�todo que apresenta
	public void apresentar() {
		System.out.println("O resultado da opera��o �: "+resultado);
	}
	
	
}
