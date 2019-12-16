/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uespi.prog2.minesweeper.engine;

import br.uespi.prog2.minesweeper.engine.Command;

/**
 *
 * @author snz
 */
public class Action implements Command{
    public void reveal(){}
    public void mark(){}
    public void unMark(){}

    @Override
    public void execute() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
