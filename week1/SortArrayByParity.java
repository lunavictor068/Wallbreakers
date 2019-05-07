package week1;

public class SortArrayByParity{
    public static void main(String[] args){
        int[] test1 = new int[]{3,1,2,4};
        System.out.println("test1: ");
        for (int i: sortArrayByParity(test1)){
            System.out.print(i);
        }
    }

    public static int[] sortArrayByParity(int[] A) {
        // final array will be same size as A
        int[] sorted_A = new int[A.length];
        int evenIndex = 0;
        int oddIndex = A.length - 1;
        for (int i = 0; i < A.length; i++) {
            // even
            if (A[i] % 2 == 0){
                sorted_A[evenIndex] = A[i];
                evenIndex++;
            }
            // odd
            else {
                sorted_A[oddIndex] = A[i];
                oddIndex--;
            }
        }
        return sorted_A;
    }
}