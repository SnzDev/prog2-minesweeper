package br.uespi.prog2.minesweeper.ui;

import br.uespi.prog2.minesweeper.engine.Game;
import br.uespi.prog2.minesweeper.messages.Messages;

public class MainScreen {
	Messages phrases;
	Game start;
	
	public MainScreen() {
		phrases = new Messages();
		start = new Game();
		System.out.println();
	}
	
	public static void main(String[] args) {
		MainScreen a = new MainScreen();
	}
}
