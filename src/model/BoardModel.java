package model;

public class BoardModel {
	DimensionModel dm;
	Zone[][] board;
	StateZone state;

	public BoardModel(DimensionModel dimension) {
		initAllZones();
	}

	private void initAllZones() {
		board = new Zone[dm.getWidth()][dm.getHeight()];
		for(int i=0; i<=dm.getWidth(); i++) {
			for(int j=0; j<=dm.getHeight(); j++) {
				board[i][j] = new Zone(state.HIDDEN, false, 0);
			}
		}
	}
	private void generateBombs() {
		
		
	}
	
}
