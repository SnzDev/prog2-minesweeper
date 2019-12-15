package engine;

import java.util.Random;

import model.Bomb;
import model.Dimension;
import model.StateZone;
import model.Zone;

public class Board {
	Dimension dm;
	Zone[][] board;
	StateZone state;
	Bomb[] bomb;
	Random random;

	public Board(Dimension dimension) {
		initAllZones();
	}

	private void initAllZones() {
		board = new Zone[dm.getWidth() + 1][dm.getHeight() + 1];

		for (int i = 1; i <= dm.getWidth(); i++) {
			for (int j = 1; j <= dm.getHeight(); j++) {
				board[i][j] = new Zone(state.HIDDEN, false, 0);
				generateBomb(i, j);
			}
		}

		// COORDINATES OF BOARD, X/Y
		for (int j = 1; j <= dm.getHeight(); j++) {
			board[0][j] = new Zone(state.COORDINATE, false, j);
		}
		for (int i = 1; i <= dm.getHeight(); i++) {
			board[i][0] = new Zone(state.COORDINATE, false, i);
		}

	}

	private void generateBomb(int i, int j) {
		int chance = random.nextInt(99) + 1;

		if (chance <= 15) {
			board[i][j].setExplosive(true);
			generateDanger(i,j);
		}
	}

	public void generateDanger(int i, int j) {
		if (board[i][j].isExplosive()) {

			board[i + 1][j + 1].setDanger(board[i + 1][j + 1].getDanger() + 1);
			board[i + 1][j].setDanger(board[i + 1][j].getDanger() + 1);
			board[i + 1][j - 1].setDanger(board[i + 1][j - 1].getDanger());

			board[i - 1][j + 1].setDanger(board[i - 1][j + 1].getDanger() + 1);
			board[i - 1][j].setDanger(board[i - 1][j].getDanger() + 1);
			board[i - 1][j - 1].setDanger(board[i - 1][j - 1].getDanger() + 1);

			board[i][j + 1].setDanger(board[i][j + 1].getDanger() + 1);
			board[i][j - 1].setDanger(board[i][j + 1].getDanger() + 1);

		}
	}

}
