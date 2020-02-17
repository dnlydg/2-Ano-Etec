package Calculadora;

import java.util.Scanner;

public class Calculadora {

	Scanner in = new Scanner(System.in);
	double peso,altura,imc;
	String imce;
	
	//método que lê valores
	public void	lerValores() {
		System.out.println("Digite sua altura: ");
		altura = in.nextDouble();
		System.out.println("Digite seu peso: ");
		peso = in.nextDouble();
		calcular();
	}
	
	//método que calcula o imc
	public void calcular() {
		imc = peso/(altura*altura);
		comparar();
	}
	
	//método que compara à tabela
	public void comparar() {
		if(imc<18.5){
			imce = "Abaixo do peso";
		}else if(imc<25){
			imce = "Peso normal";
		}else if(imc<30){
			imce = "Sobrepeso";
		}else if(imc<35){
			imce = "Obesidade Grau 1";
		}else if(imc<40){
			imce = "Obesidade Grau 2";
		}else {
			imce = "Obesidade Grau 3";
		}
		apresentar();
	}
	
	//método que apresenta
	public void apresentar() {
		System.out.printf("Seu IMC é: %.1f\n",imc);
		System.out.println("Você Está: "+imce);
	}
	
}
