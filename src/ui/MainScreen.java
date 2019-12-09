package ui;

import engine.Game;
import messages.Messages;

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
