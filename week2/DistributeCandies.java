package week2;

import java.util.HashSet;

public class DistributeCandies {

    public int distributeCandies(int[] candies) {
        HashSet<Integer> kinds = new HashSet<>();
        for (int kind:candies) {
            kinds.add(kind);
        }
        return Math.min(kinds.size(), candies.length / 2);
    }

}
