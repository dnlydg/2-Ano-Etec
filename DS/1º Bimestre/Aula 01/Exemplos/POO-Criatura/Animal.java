package Criatura;

	public class Animal {

			
			String nome;
			int idade;
			String tamanho;
			char sexo;
			String raca;
			String cor;
			String especie;
			boolean selvagem;
			String tipoAnimal;
			String som;
			boolean andando;
			boolean correndo;
			
			public void caminhar(){
				if (andando) {
					System.out.println("Ol� estou caminhando");
				}else{
					System.out.println("N�o posso caminhar");
				}
			}
			public void brincar(){

			}
			public void morder(){
				
			}
			public void cacar(){
				
			}
			public void correr(){
				if (correndo) {
					System.out.println("Estou correndo");
				}else{
					System.out.println("N�o posso correr");
				}
			}
			public void comer(){
				
			}
			
	}

