package com.company;

import java.util.Random;

public class Life {
    private static final int maxNeighbourDistance = 1;
    private boolean[][] matrix;
    private int currentGeneration;

    public Life(int sizeX, int sizeY) {
        matrix = new boolean[sizeY][sizeX];
        currentGeneration = 0;

        generateInitialRandom();
    }

    public Life(int size) {
        matrix = new boolean[size][size];
        currentGeneration = 0;

        generateInitialRandom();
    }

    private int countAliveNeighbours(int x, int y) {
        int alive = 0;

        for (int iy = y - maxNeighbourDistance; iy <= y + maxNeighbourDistance; iy++) {
            for (int ix = x - maxNeighbourDistance; ix <= x + maxNeighbourDistance; ix++) {
                if (!(ix == x && iy == y) && (ix >= 0 && ix < matrix[0].length && iy >= 0 && iy < matrix.length) && matrix[iy][ix]) {
                    alive++;
                }
            }
        }

        return alive;
    }

    public void nextGeneration() {
        boolean[][] workGrid = new boolean[matrix.length][matrix[0].length];

        for (int iy = 0; iy < matrix.length; iy++) {
            for (int ix = 0; ix < matrix[iy].length; ix++) {
                int alive = countAliveNeighbours(ix, iy);
                if (getState(ix, iy)) {
                    if (alive <= 1) {
                        workGrid[iy][ix] = false;
                    } else {
                        workGrid[iy][ix] = alive == 2 || alive == 3;
                    }
                } else {
                    if (alive == 3) {
                        workGrid[iy][ix] = true;
                    }
                }
            }
        }

        currentGeneration++;
        matrix = workGrid;
    }

    public void generateInitialRandom() {
        Random random = new Random();
        for (int iy = 0; iy < matrix.length; iy++) {
            for (int ix = 0; ix < matrix[iy].length; ix++) {
                matrix[iy][ix] = random.nextBoolean();
            }
        }
    }


    public int getCurrentGeneration() {
        return currentGeneration;
    }

    public int getSizeX() {
        return matrix[0].length;
    }

    public int getSizeY() {
        return matrix.length;
    }

    public boolean getState(int x, int y) {
        return matrix[y][x];
    }

    public void setState(int x, int y, boolean value) {
        matrix[y][x] = value;
    }

    @Override
    public String toString() {
        String returnString = "";

        for (int iy = 0; iy < matrix.length; iy++) {
            String subStr = "";
            for (int ix = 0; ix < matrix[iy].length; ix++) {
                subStr += " " + (matrix[iy][ix] ? "X" : " ") + " |";
            }

            returnString += subStr + "\n";
            for (int i = 0; i < subStr.length(); i++) {
                returnString += "-";
            }
            returnString += "\n";
        }

        return returnString;
    }
}
