package week2;

import java.util.HashSet;

public class UncommonWordsfromTwoSentences {
    public static void main(String[] args) {
        String A = "this apple is sweet";
        String B = "this apple is sour";
        for (String uncommon : uncommonFromSentences(A, B))
            System.out.println(uncommon);
        String C = "apple apple";
        String D = "banana";
        for (String uncommon : uncommonFromSentences(C, D))
            System.out.println(uncommon);
    }

    public static String[] uncommonFromSentences(String A, String B) {
        HashSet<String> uncommon = new HashSet<>();
        HashSet<String> seen = new HashSet<>();

        addUniqueWords(A, uncommon, seen);
        addUniqueWords(B, uncommon, seen);

        // convert HashSet to String[]
        String[] uncommonArray = new String[uncommon.size()];
        uncommon.toArray(uncommonArray);

        return uncommonArray;
    }

    public static void addUniqueWords(String sentence, HashSet<String> uncommon, HashSet<String> seen) {
        for (String word : sentence.split(" ")) {
            if (seen.contains(word)) {
                uncommon.remove(word);
            } else {
                uncommon.add(word);
                seen.add(word);
            }
        }
    }

}
