package com.example.treasurehunt.model;

public class Clue {

    private int position;
    private boolean found;
    private boolean removeLife;
    private boolean bonus;
    private boolean treasure;

    public Clue(int position, boolean found, boolean removeLife, boolean bonus, boolean treasure) {
        this.position = position;
        this.found = found;
        this.removeLife = removeLife;
        this.bonus = bonus;
        this.treasure = treasure;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isFound() {
        return found;
    }

    public void setFound(boolean found) {
        this.found = found;
    }

    public boolean isRemoveLife() {
        return removeLife;
    }

    public void setRemoveLife(boolean removeLife) {
        this.removeLife = removeLife;
    }

    public boolean isBonus() {
        return bonus;
    }

    public void setBonus(boolean bonus) {
        this.bonus = bonus;
    }

    public boolean isTreasure() {
        return treasure;
    }

    public void setTreasure(boolean treasure) {
        this.treasure = treasure;
    }
}
