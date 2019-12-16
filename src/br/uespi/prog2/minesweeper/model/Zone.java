package br.uespi.prog2.minesweeper.model;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Zone {

    StateZone actualState;
    boolean explosive;
    int danger;

    public Zone(StateZone state, boolean bomb, int number) {
        setActualState(state);
        setExplosive(bomb);
        setDanger(number);
    }

    /**
     * @return the actualState
     */
    public StateZone getActualState() {
        return actualState;
    }

    /**
     * @param actualState the actualState to set
     */
    public void setActualState(StateZone actualState) {
        this.actualState = actualState;
    }

    /**
     * @return the explosive
     */
    public boolean isExplosive() {
        return explosive;
    }

    /**
     * @param explosive the explosive to set
     */
    public void setExplosive(boolean explosive) {
        this.explosive = explosive;
    }

    /**
     * @return the danger
     */
    public int getDanger() {
        return danger;
    }

    /**
     * @param danger the danger to set
     */
    public void setDanger(int danger) {
        this.danger = danger;
    }

    public String printZone() {
        NumberFormat formatter = new DecimalFormat("00");
        String value = null;
        switch (getActualState()) {
            case HIDDEN:
                value =  (" -");
                break;
            case COORDINATE:
                value =  formatter.format(getDanger());
                break;
            case MARKED:
                value =  (" !");
                break;
            case REVEALED:
                value =  formatter.format(getDanger());
                break;
        }
        return value;
    }
}
