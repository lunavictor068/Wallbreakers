package week2;

import java.util.HashSet;

public class ValidSudoku {

    public static void main(String[] args){
        char[][] board = new char[][] {
                {'.','.','.','.','.','.','.','.','.'},
                {'4','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','6','.','.'},
                {'.','.','.','3','8','.','.','.','.'},
                {'.','5','.','.','.','6','.','.','1'},
                {'8','.','.','.','.','.','.','6','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','7','.','9','.','.','.','.'},
                {'.','.','.','6','.','.','.','.','.'}
        };
        System.out.println(isValidSudoku(board));
    }


    public static boolean isValidSudoku(char[][] board) {
        boolean isValid = true;
        // check rows
        rows:
        for (int i = 0; i < board.length; i++) {
            HashSet<Character> seen = new HashSet<>();
            for (int j = 0; j < board[i].length; j++) {
                char cell = board[i][j];
                if (Character.isDigit(cell)){
                    if (seen.contains(cell)){
                        isValid = false;
                        break rows;
                    }
                    else {
                        seen.add(cell);
                    }
                }
            }
        }
        if (isValid) {
            columns:
            for (int i = 0; i < board[0].length; i++) {
                HashSet<Character> seen = new HashSet<>();
                for (int j = 0; j < board.length; j++) {
                    char cell = board[j][i];
                    if (Character.isDigit(cell)) {
                        if (seen.contains(cell)) {
                            isValid = false;
                            break columns;
                        } else {
                            seen.add(cell);
                        }
                    }
                }
            }
        }
        if (isValid){
            subgrids:
            for (int i = 0; i < board.length; i+=3) {
                for (int j = 0; j < board.length; j+=3) {
                    // subgrid traversal
                    HashSet<Character> seen = new HashSet<>();
                    for (int k = i; k < i + 3; k++) {
                        for (int l = j; l < j + 3; l++) {
                            char cell = board[k][l];
                            if (Character.isDigit(cell)) {
                                if (seen.contains(cell)) {
                                    isValid = false;
                                    System.out.print(cell);
                                    break subgrids;
                                } else {
                                    seen.add(cell);
                                }
                            }
                            System.out.print(cell);
                        }
                        System.out.println();
                    }
                    System.out.println("---------------------");
                }
            }
        }
        return isValid;
    }

}
