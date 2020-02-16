package Automovel;

public class Veiculo {

	String modelo;
	String cor;
	String marca;
	int ano;
	String comprimento;
	String eixo;
	String largura;
	String altura;
	String peso;
	String transmissao;
	String motor;
	int lugares;
	boolean buzina;
	boolean farol;
	boolean acelera;
	boolean freia;
	boolean vira;
	
	public void acelerar(){
		if(acelera){
			System.out.println("O Veículo está acelerando");
			if(freia && vira){
				System.out.println("ELE TA DRIFTANDO MUITO");
			}
		}else{
			System.out.println("O Veículo não está acelerando");
		}
	}
	public void freiar(){
		if(freia) {
			System.out.println("O Veículo está freiando");
		}else {
			System.out.println("O Veículo não está freiando");
		}
	}
	public void buzinar(){
		if(buzina){
			System.out.println("O Veículo está buzinando");
		}else{
			System.out.println("O Veículo não está buzinando");
		}
	}
	public void ligarFarol(){
		if(farol){
			System.out.println("O Farol está ligado");
		}else{
			System.out.println("O Farol está desligado");
		}
	}
	public void virar(){
		if(vira) {
			System.out.println("O Veículo ta virando");
		}else {
			System.out.println("O Veículo não está freiando");
		}
	}
	
}
