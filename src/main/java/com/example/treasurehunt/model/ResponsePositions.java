package com.example.treasurehunt.model;

import java.util.Map;

public class ResponsePositions {
    private int positionPlayer;
    private Map<String, Clue> clues;

    public ResponsePositions(int positionPlayer, Map<String, Clue> clues) {
        this.positionPlayer = positionPlayer;
        this.clues = clues;
    }

    public int getPositionPlayer() {
        return positionPlayer;
    }

    public void setPositionPlayer(int positionPlayer) {
        this.positionPlayer = positionPlayer;
    }

    public Map<String, Clue> getClues() {
        return clues;
    }

    public void setClueMap(Map<String, Clue> clueMap) {
        this.clues = clues;
    }
}
