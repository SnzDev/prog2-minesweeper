package br.uespi.prog2.minesweeper.engine;

import java.util.Random;

import br.uespi.prog2.minesweeper.model.Bomb;
import br.uespi.prog2.minesweeper.model.Coordinate;
import br.uespi.prog2.minesweeper.model.Dimension;
import br.uespi.prog2.minesweeper.model.StateZone;
import br.uespi.prog2.minesweeper.model.Zone;

public class Board {

    Dimension dm;
    Zone[][] board;
    StateZone state;
    Bomb[] bomb;

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
        this.dm = dimension;
        initAllZones();
        System.out.println("a");
    }

    private void initAllZones() {
        Coordinate tempCoordinate = new Coordinate();
        board = new Zone[dm.getHeight() + 1][dm.getWidth() + 1];

        for (int i = 1; i <= dm.getHeight(); i++) {
            for (int j = 1; j <= dm.getWidth(); j++) {
                tempCoordinate.setX(j);
                tempCoordinate.setY(i);
                board[tempCoordinate.getY()][tempCoordinate.getX()] = new Zone(StateZone.HIDDEN, false, 0);
                generateBomb(tempCoordinate);
            }
        }
        
        // COORDINATES OF BOARD, X/Y
        board[0][0] = new Zone(state.COORDINATE, false, 00);
        for (int i = 1; i <= dm.getHeight(); i++) {
            board[i][0] = new Zone(state.COORDINATE, false, i);
        }
        for (int j = 1; j <= dm.getWidth(); j++) {
            board[0][j] = new Zone(state.COORDINATE, false, j);
        }

    }

    private void generateBomb(Coordinate c) {
        Random random = new Random();
        int chance = random.nextInt(99) + 1;

        if (chance < 15) {
            board[c.getY()][c.getX()].setExplosive(true);
            generateDanger(c);
        }
    }

    public void generateDanger(Coordinate c) {
        if (board[c.getY()][c.getX()].isExplosive()) {

            new ZoneValidator(this, c);

        }
    }

    public void PrintBoard() {
        for (int i = 0; i <= dm.getHeight(); i++) {
            System.out.println("");
            for (int j = 0; j <= dm.getWidth(); j++) {
                System.out.print(board[i][j].printZone() + " |");
            }
        }

    }
}
