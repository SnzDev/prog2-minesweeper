package engine;

import java.util.Random;

import model.Bomb;
import model.Coordinate;
import model.Dimension;
import model.StateZone;
import model.Zone;
import validator.ZoneValidator;

public class Board {
	Dimension dm;
	Zone[][] board;
	StateZone state;
	Bomb[] bomb;
	Random random;

	public Dimension getDm() {
		return dm;
	}

	public void setDm(Dimension dm) {
		this.dm = dm;
	}

	public Zone[][] getBoard() {
		return board;
	}

	public void setBoard(Zone[][] board) {
		this.board = board;
	}

	public Board(Dimension dimension) {
		initAllZones();
	}

	private void initAllZones() {
		Coordinate tempCoordinate = new Coordinate();
		board = new Zone[dm.getWidth() + 1][dm.getHeight() + 1];

		for (int i = 1; i <= dm.getWidth(); i++) {
			for (int j = 1; j <= dm.getHeight(); j++) {
				tempCoordinate.setX(j);
				tempCoordinate.setY(i);
				board[tempCoordinate.getY()][tempCoordinate.getX()] = new Zone(state.HIDDEN, false, 0);
				generateBomb(tempCoordinate);
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

	private void generateBomb(Coordinate c) {
		int chance = random.nextInt(99) + 1;

		if (chance <= 15) {
			board[c.getY()][c.getX()].setExplosive(true);
			generateDanger(c);
		}
	}

	public void generateDanger(Coordinate c) {
		if (board[c.getY()][c.getX()].isExplosive()) {

			new ZoneValidator(this, c);

		}
	}

}
