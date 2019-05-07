package week1;

import java.util.HashMap;
import java.util.HashSet;

public class SingleNumber {
    public static void main(String[] args){
        int[] test = new int[] {4,1,2,1,2};
        System.out.println(singleNumber(test));
    }

    public static int singleNumber(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (seen.contains(nums[i])) {
                seen.remove(nums[i]);
            } else {
                seen.add(nums[i]);
            }
        }
        int number = 0;
        for (int i: seen){
            number += i;
        }
        return number;
    }
}
