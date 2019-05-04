public class TransposeMatrix {

    public static void main (String[] args){
        int[][] test1 = {{1,2,3},{4,5,6}};
        int[][] transpose = transpose(test1);
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] A) {
        int[][] transpose = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                transpose[j][i] = A[i][j];
            }
        }
        return transpose;
    }
}
