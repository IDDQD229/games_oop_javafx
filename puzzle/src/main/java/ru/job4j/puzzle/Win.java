package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int index = 0; index < board.length; index++) {
            if (board[index][index] == 1) {
                int countX = 0;
                int countY = 0;
                for (int j = 0; j < board.length; j++) {
                    if (board[index][j] == 1) {
                        countX++;
                    }
                    if (board[j][index] == 1) {
                        countY++;
                    }
                    if (countY == board.length || countX == board.length) {
                        rsl = true;
                        break;
                    }

                }

            }

        }
        return rsl;
    }
}
