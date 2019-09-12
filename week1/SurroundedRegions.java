package week1;

public class SurroundedRegions {

    public static void main(String[] args){
        char[][] test = 
                {
                        {'X','X','X','X'},
                        {'X','O','O','X'},
                        {'X','X','O','X'},
                        {'X','O','X','X'}
                };
        solve(test);
        for (char[] chars: test) {
            for (char c : chars){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void solve(char[][] board) {
        for (int row = 0; row < board.length - 1; row++) {
            for (int column = 0; column < board[0].length - 1; column++) {
                if (!inBorder(row, column, board) && !connectedto0(row, column, board) && board[row][column] == 'O'){
                    board[row][column] = 'X';
                }
            }
        }
    }

    public static boolean inBorder(int row, int column, char[][] board){
        return row == 0 || column == 0 || board.length - 1 == row || board[0].length - 1 == column;
    }

    public static boolean connectedto0(int row, int column, char[][] board){
        boolean connectedto0 = false;
            if (row - 1 >= 0) {
                if (board[row - 1][column] == 'O') {
                    connectedto0 = true;
                }
            }
            if (row + 1 < board.length - 1) {
                if (board[row + 1][column] == 'O') {
                    connectedto0 = true;
                }
            }
            if (column - 1 >= 0) {
                if (board[row][column - 1] == 'O') {
                    connectedto0 = true;
                }
            }
            if (column + 1 < board.length - 1) {
                if (board[row][column + 1] == 'O') {
                    connectedto0 = true;
                }
            }
            return connectedto0;
    }

}
