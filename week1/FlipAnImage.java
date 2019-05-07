package week1;

public class FlipAnImage {
    public static void main(String[] args){

    }

    public int[][] flipAndInvertImage(int[][] A) {
        int[][] inverted = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                // fill inverted array from left to right with A[i] values from right to left, invert A[i] value
                inverted[i][j] = invert(A[i][A[i].length - 1 - j]);
            }
        }
        return inverted;
    }

    public static int invert(int i){
        int inverted = 1;
        if (i == 1){
            inverted = 0;
        }
        return inverted;
    }
}
