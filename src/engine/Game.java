package engine;

import java.util.Scanner;

import messages.Messages;
import model.DimensionModel;
import model.PlayerModel;
import model.StateGame;

public class Game {
	Scanner sc = new Scanner(System.in);
	Messages phrases;
	PlayerModel player;
	DimensionModel dimension;
	String dimensionString[];
	StateGame state;
	Enum<StateGame> actualState;

	public Game() {
		init();

		while (actualState.equals(state.NEW_GAME)) {
			startGame();

			actualState = state.RUNNING;
			do {

			} while (actualState.equals(state.RUNNING));

			System.out.println("Altura: " + dimension.getHeight());
			System.out.println("Largura: " + dimension.getWidth());
		}
	}

	private void init() {
		phrases = new Messages();
		player = new PlayerModel();
		dimension = new DimensionModel();
		actualState = state.NEW_GAME;

	}

	private void startGame() {
		phrases.welcome();
		phrases.writeName();
		player.setName(sc.nextLine());

		phrases.writeDimension();
		dimensionString = sc.nextLine().split("x");
		dimension.setHeight(Integer.parseInt(dimensionString[0]));// Setting the height
		dimension.setWidth(Integer.parseInt(dimensionString[1]));// Setting the width
	}
}
