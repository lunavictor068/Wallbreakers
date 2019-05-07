package week1;

import java.util.ArrayList;
import java.util.HashSet;

public class ValidAnagram {
    public static void main(String[] args){
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "cat"));
    }

    public static boolean isAnagram(String s, String t) {
        boolean isAnagram = true;
        ArrayList<Character> sList = new ArrayList<>();
        for (Character c:s.toCharArray()){
            sList.add(c);
        }
        for (Character c:t.toCharArray()){
            if (!sList.contains(c)){
                isAnagram = false;
                break;
            }
            else {
                sList.remove(c);
            }
        }
        return isAnagram && (sList.size() == 0);

    }
}
