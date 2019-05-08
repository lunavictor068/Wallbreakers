package week2;

import java.util.ArrayList;
import java.util.HashSet;

public class HappyNumber {

    public static void main(String[] args){
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)){
            seen.add(n);
            n = sumOfSquares(n);
        }
        return n == 1;
    }

    public static int sumOfSquares(int n){
        ArrayList<Integer> integers = toIntArray(n);
        int sum = 0;
        for (Integer integer:integers)
            sum += Math.pow(integer, 2);
        return sum;
    }

    public static ArrayList<Integer> toIntArray(int n){
        ArrayList<Integer> integers = new ArrayList<>();
        while (n > 9){
            integers.add(n % 10);
            n = n / 10;
        }
        integers.add(n);
        return integers;
    }

}
