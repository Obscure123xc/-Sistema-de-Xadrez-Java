package application;

import jogoTabuleiro.Tabuleiro;
import xadrez.PartidaXadrez;

public class Program {

	public static void main(String[] args) {

		PartidaXadrez partidaxadrez = new PartidaXadrez();
		UI.printTabuleiro(partidaxadrez.getPecas());
	}

}
