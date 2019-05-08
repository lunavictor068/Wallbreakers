package week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class GroupsofSpecialEquivalentStrings {

    public static void main(String[] args){
        String[] words = new String[]{"abc","acb","bac","bca","cab","cba"};
        for (String word:words)
            System.out.println(getStringKey(word));

    }

    public int numSpecialEquivGroups(String[] A) {
        HashSet<String> groupKeys = new HashSet<>();
        for (String word:A)
            groupKeys.add(getStringKey(word));
        return groupKeys.size();
    }

    public static String getStringKey(String word){
        ArrayList<Character> zeroStart = new ArrayList<>();
        ArrayList<Character> oneStart= new ArrayList<>();
        char[] wordCharacters = word.toCharArray();
        for (int i = 0; i < wordCharacters.length; i++) {
            if (i % 2 == 0){
                zeroStart.add(wordCharacters[i]);
            }
            else {
                oneStart.add(wordCharacters[i]);
            }
        }
        Collections.sort(zeroStart);
        Collections.sort(oneStart);
        StringBuilder zeroBuilder = new StringBuilder();
        for (char c:zeroStart){
            zeroBuilder.append(c);
        }
        StringBuilder oneBuilder = new StringBuilder();
        for (char c:zeroStart){
            oneBuilder.append(c);
        }
        return zeroBuilder.toString() + "," + oneBuilder.toString();
    }

}
