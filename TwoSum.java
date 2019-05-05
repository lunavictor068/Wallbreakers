import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class TwoSum {
    public static void main(String[] args){

    }

    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (seen.containsKey(target - nums[i])){
                arr[0] = seen.get(target - nums[i]);
                arr[1] = i;
            }
            else {
                seen.put(nums[i], i);
            }
        }
        return arr;
    }
}
