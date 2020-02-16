package Automovel;

public class Kombi {

	public static void main(String[] args) {
		
		Veiculo kombi = new Veiculo();
		
		kombi.modelo = "Volkswagen Kombi";
		kombi.cor = "Azul";
		kombi.marca = "Volkswagen";
		kombi.ano = 1950;
		kombi.comprimento = "4505 mm";
		kombi.eixo = "2400 mm";
		kombi.largura = "1720 mm";
		kombi.altura = "2050 mm";
		kombi.peso = "1297 Kg";
		kombi.transmissao = "4 velocidades";
		kombi.motor = "1600cc";
		kombi.lugares = 12;
		kombi.buzina = true;
		kombi.farol = false;
		kombi.acelera = true;
		kombi.freia = true;
		kombi.vira = true;
		
		System.out.println("Modelo: "+kombi.modelo);
		System.out.println("Cor: "+kombi.cor);
		System.out.println("Marca: "+kombi.marca);
		System.out.println("Ano: "+kombi.ano);
		System.out.println("Comprimento: "+kombi.comprimento);
		System.out.println("Entre eixo: "+kombi.eixo);
		System.out.println("Largura: "+kombi.largura);
		System.out.println("Altura: "+kombi.altura);
		System.out.println("Peso: "+kombi.peso);
		System.out.println("Transmissão: "+kombi.transmissao);
		System.out.println("Motor: "+kombi.motor);
		System.out.println("Lugares: "+kombi.lugares);
		kombi.buzinar();
		kombi.ligarFarol();
		kombi.acelerar();
		kombi.freiar();
		kombi.virar();

	}

}
