package Calculadora;

import java.util.Scanner;

public class Calculadora {

	Scanner in = new Scanner(System.in);
	
	double numero1;
	double numero2;
	double resultado;
	String operacao;
	
	
	//método que inicia a calculadora, lê os valores e chama o método de cálculo
	public void iniciar() {
		
		System.out.println("Iniciando a calculadora...");
		System.out.println("Por favor, digite o 1º valor:");
		numero1 = in.nextDouble();
		System.out.println("Ok, Agora digite o 2º valor:");
		numero2 = in.nextDouble();
		selecionarOperacao();
	}
	
	//método que seleciona a operação
	public void selecionarOperacao() {
		System.out.println("Agora, digite a operação desejada: ");
		System.out.println("| / para Divisão | * para Multiplicação | - para Subtração | + para Adição |");
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
			System.out.println("Operação Inválida");
			break;
		}
	}
	
	//método que multiplica 
	public void multiplicar() {
		resultado=numero1*numero2;
		apresentar();
	}
	
	//método que divide
	public void dividir() {
		resultado=numero1/numero2;
		apresentar();
	}
	
	//método que subtrai
	public void subtrair() {
		resultado=numero1-numero2;
		apresentar();
	}
	
	//método que soma
	public void somar() {
		resultado=numero1+numero2;
		apresentar();
	}
	
	//método que apresenta
	public void apresentar() {
		System.out.println("O resultado da operação é: "+resultado);
	}
	
	
}
