package week1;

import java.util.HashSet;

public class ReverseVowelsofaString {
    public static void main(String[] args){
        System.out.println(reverseVowels("hello"));
        System.out.println(reverseVowels("leetcode"));
    }

    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (!vowels.contains(Character.toLowerCase(s.charAt(left)))){
                left++;
                continue;
            }
            else if (!vowels.contains(Character.toLowerCase(s.charAt(right)))){
                right--;
                continue;
            }
            else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
            }
            left++;
            right--;
        }
        return new String(chars);
    }
}
