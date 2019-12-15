package engine;

import java.util.Scanner;

import messages.Messages;
import model.Dimension;
import model.Player;
import model.StateGame;

public class Game {
	Scanner sc = new Scanner(System.in);
	Messages phrases;
	Player player;
	Dimension dimension;
	String dimensionString[];
	StateGame actualState;

	public Game() {
		init();

		while (actualState.equals(StateGame.NEW_GAME)) {
			startGame();

			new Board(dimension);
			

			System.out.println("Altura: " + dimension.getHeight());
			System.out.println("Largura: " + dimension.getWidth());
		}
	}

	private void init() {
		phrases = new Messages();
		player = new Player();
		dimension = new Dimension();
		actualState = StateGame.NEW_GAME;

	}

	private void startGame() {
		phrases.welcome();
		phrases.writeName();
		player.setName(sc.nextLine());
		System.out.println("a");

		phrases.writeDimension();
		dimensionString = sc.nextLine().split("x");
		dimension.setHeight(Integer.parseInt(dimensionString[0]));// Setting the height
		dimension.setWidth(Integer.parseInt(dimensionString[1]));// Setting the width
		
		actualState = StateGame.RUNNING;
	}
}
