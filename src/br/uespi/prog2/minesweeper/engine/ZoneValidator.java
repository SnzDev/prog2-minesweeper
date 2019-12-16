package br.uespi.prog2.minesweeper.engine;

import br.uespi.prog2.minesweeper.engine.Board;
import br.uespi.prog2.minesweeper.model.Coordinate;
import br.uespi.prog2.minesweeper.model.Zone;

public class ZoneValidator {

    private boolean valid;
    private Zone[][] boardTemp;
    private Coordinate c;

    public ZoneValidator(Board b, Coordinate c) {
        this.c = c;
        BD(b);
        BM(b);
        BE(b);

        CD(b);
        CM(b);
        CE(b);

        MD(b);
        ME(b);
    }

    public void BD(Board b) {
        boardTemp = b.getBoard();
        try {
            boardTemp[c.getY() + 1][c.getX() + 1].setDanger(boardTemp[c.getY() + 1][c.getX() + 1].getDanger() + 1);
        } catch (Exception e) {
            System.out.println("Erro de Posição de Bomba BD" + e);
            return;
        }
        b.setBoard(boardTemp);

    }

    public void BM(Board b) {
        boardTemp = b.getBoard();
        try {
            boardTemp[c.getY() + 1][c.getX()].setDanger(boardTemp[c.getY() + 1][c.getX()].getDanger() + 1);
        } catch (Exception e) {
            System.out.println("Erro de Posição de Bomba BM" + e);
            return;
        }
        b.setBoard(boardTemp);

    }

    public void BE(Board b) {
        boardTemp = b.getBoard();
        try {
            boardTemp[c.getY() + 1][c.getX() - 1].setDanger(boardTemp[c.getY() + 1][c.getX() - 1].getDanger() + 1);
        } catch (Exception e) {
            System.out.println("Erro de Posição de Bomba BE" + e);
            return;
        }
        b.setBoard(boardTemp);

    }

    public void CD(Board b) {
        boardTemp = b.getBoard();
        try {
            boardTemp[c.getY() - 1][c.getX() + 1].setDanger(boardTemp[c.getY() - 1][c.getX() + 1].getDanger() + 1);
        } catch (Exception e) {
            System.out.println("Erro de Posição de Bomba CD" + e);
            return;
        }
        b.setBoard(boardTemp);

    }

    public void CM(Board b) {
        boardTemp = b.getBoard();
        try {
            boardTemp[c.getY() - 1][c.getX()].setDanger(boardTemp[c.getY() - 1][c.getX()].getDanger() + 1);
        } catch (Exception e) {
            System.out.println("Erro de Posição de Bomba CM" + e);
            return;
        }
        b.setBoard(boardTemp);

    }

    public void CE(Board b) {
        boardTemp = b.getBoard();
        try {
            boardTemp[c.getY() - 1][c.getX() - 1].setDanger(boardTemp[c.getY() - 1][c.getX() - 1].getDanger() + 1);
        } catch (Exception e) {
            System.out.println("Erro de Posição de Bomba CE" + e);
            return;
        }
        b.setBoard(boardTemp);

    }

    public void MD(Board b) {
        boardTemp = b.getBoard();
        try {
            boardTemp[c.getY()][c.getX() + 1].setDanger(boardTemp[c.getY()][c.getX() + 1].getDanger() + 1);
        } catch (Exception e) {
            System.out.println("Erro de Posição de Bomba MD" + e);
            return;
        }
        b.setBoard(boardTemp);

    }

    public void ME(Board b) {
        boardTemp = b.getBoard();
        try {
            boardTemp[c.getY()][c.getX() - 1].setDanger(boardTemp[c.getY()][c.getX() - 1].getDanger() + 1);
        } catch (Exception e) {
            System.out.println("Erro de Posição de Bomba ME" + e);
            return;
        }
        b.setBoard(boardTemp);

    }
}
