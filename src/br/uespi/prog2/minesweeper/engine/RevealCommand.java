/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uespi.prog2.minesweeper.engine;

import br.uespi.prog2.minesweeper.model.Coordinate;

/**
 *
 * @author snz
 */
public class RevealCommand {

    private Coordinate cord;

    public RevealCommand(Coordinate c) {
        this.cord = c;
    }
}
