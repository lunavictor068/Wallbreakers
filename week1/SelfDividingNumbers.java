package week1;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args){

    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> numbersList = new ArrayList<>();
        for (int i = left; i <= right ; i++) {
            if (isSelfDividing(i)){
                numbersList.add(i);
            }
        }
        return numbersList;
    }

    public static int[] separateNumbers(int number){
        String numberStr = Integer.toString(number);
        int[] numberArr = new int[numberStr.length()];
        for (int i = 0; i < numberArr.length; i++) {
            numberArr[i] = Character.getNumericValue(numberStr.charAt(i));
        }
        return numberArr;
    }

    public static boolean isSelfDividing(int number){
        boolean selfDividing = true;
        for (int n : separateNumbers(number)) {
            if (n == 0) {
                selfDividing = false;
                break;
            }
            if (number % n != 0) {
                selfDividing = false;
                break;
            }
        }
        return selfDividing;
    }
}
