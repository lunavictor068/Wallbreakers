package week2;

import java.util.HashSet;

public class JewelsandStones {

    public int numJewelsInStones(String J, String S) {
        HashSet<Character> jewels = new HashSet<>();
        for (Character jewel:J.toCharArray())
            jewels.add(jewel);

        int jewelCount = 0;
        for (Character stone:S.toCharArray())
            if (jewels.contains(stone))
                jewelCount++;
        return jewelCount;
    }
}
