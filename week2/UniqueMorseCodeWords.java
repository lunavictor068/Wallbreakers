package week2;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueMorseCodeWords {

    public int uniqueMorseRepresentations(String[] words) {
        String[] morseTable = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        HashMap<Character, String> morseMapping = new HashMap<>();
        for (int i = 0; i < morseTable.length; i++)
            morseMapping.put(alphabet[i], morseTable[i]);

        HashSet<String> uniqueTransformations = new HashSet<>();
        for (String word:words){
            StringBuffer morseTransformation = new StringBuffer();
            for (char letter:word.toCharArray()){
                morseTransformation.append(morseMapping.get(letter));
            }
            uniqueTransformations.add(morseTransformation.toString());
        }

        return uniqueTransformations.size();
    }

}
