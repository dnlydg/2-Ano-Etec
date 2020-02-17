package Calculadora;

import java.util.Scanner;

public class Calculadora {

	Scanner in = new Scanner(System.in);
	double peso,altura,imc;
	String imce;
	
	//m�todo que l� valores
	public void	lerValores() {
		System.out.println("Digite sua altura: ");
		altura = in.nextDouble();
		System.out.println("Digite seu peso: ");
		peso = in.nextDouble();
		calcular();
	}
	
	//m�todo que calcula o imc
	public void calcular() {
		imc = peso/(altura*altura);
		comparar();
	}
	
	//m�todo que compara � tabela
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
	
	//m�todo que apresenta
	public void apresentar() {
		System.out.printf("Seu IMC �: %.1f\n",imc);
		System.out.println("Voc� Est�: "+imce);
	}
	
}
