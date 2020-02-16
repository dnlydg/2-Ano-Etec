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
			System.out.println("O Ve�culo est� acelerando");
			if(freia && vira){
				System.out.println("ELE TA DRIFTANDO MUITO");
			}
		}else{
			System.out.println("O Ve�culo n�o est� acelerando");
		}
	}
	public void freiar(){
		if(freia) {
			System.out.println("O Ve�culo est� freiando");
		}else {
			System.out.println("O Ve�culo n�o est� freiando");
		}
	}
	public void buzinar(){
		if(buzina){
			System.out.println("O Ve�culo est� buzinando");
		}else{
			System.out.println("O Ve�culo n�o est� buzinando");
		}
	}
	public void ligarFarol(){
		if(farol){
			System.out.println("O Farol est� ligado");
		}else{
			System.out.println("O Farol est� desligado");
		}
	}
	public void virar(){
		if(vira) {
			System.out.println("O Ve�culo ta virando");
		}else {
			System.out.println("O Ve�culo n�o est� freiando");
		}
	}
	
}
