package funcoes;

import smartphone.iPhone;



public class Usuario {

	public static void main(String[] args) {
		iPhone cell = new iPhone();
		AparelhoTelefonico aparelhoTelefonico = cell;
		NavegadorInternet navegadorInternet = cell;
		ReprodutorMusical reprodudorMusical = cell;
		
		aparelhoTelefonico.ligar("4846516");
		aparelhoTelefonico.atender("44959623");
		navegadorInternet.adicionarNovaAba(null);
		reprodudorMusical.pausar();
		
		
	}

}

