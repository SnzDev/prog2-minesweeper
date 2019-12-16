package br.uespi.prog2.minesweeper.engine;

import java.util.Scanner;

import br.uespi.prog2.minesweeper.messages.Messages;
import br.uespi.prog2.minesweeper.model.Dimension;
import br.uespi.prog2.minesweeper.model.Player;
import br.uespi.prog2.minesweeper.model.StateGame;

public class Game {

    Scanner sc = new Scanner(System.in);
    Messages phrases;
    Player player;
    Dimension dimension;
    StateGame actualState;

    public Game() {
        init();

        startGame();
        System.out.println("Altura: " + dimension.getHeight());
        System.out.println("Largura: " + dimension.getWidth());
        Board board = new Board(dimension);
        board.PrintBoard();
        

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

        String dimensionString[];
        phrases.writeDimension();
        dimensionString = sc.nextLine().split("x");
        dimension.setWidth(Integer.parseInt(dimensionString[0]));// Setting the height
        dimension.setHeight(Integer.parseInt(dimensionString[1]));// Setting the width

        actualState = StateGame.RUNNING;
    }
}
