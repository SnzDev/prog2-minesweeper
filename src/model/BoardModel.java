package model;

public class BoardModel {
	DimensionModel dm;
	Zone[][] board;
	StateZone state;
	public BoardModel() {
		board = new Zone[10][10];
		board[1][1] = new Zone(state.COBERTO,true, 2);
	}
}
