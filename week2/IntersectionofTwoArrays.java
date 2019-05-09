package week2;

import java.util.HashSet;

public class IntersectionofTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> nums1Hash = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();
        for (int n:nums1){
            nums1Hash.add(n);
        }
        for (int n:nums2){
            if (nums1Hash.contains(n)){
                intersection.add(n);
            }
        }
        int[] intersectionArray = new int[intersection.size()];
        int i = 0;
        for (Integer number:intersection){
            intersectionArray[i] = number;
            i++;
        }
        return intersectionArray;
    }

}
