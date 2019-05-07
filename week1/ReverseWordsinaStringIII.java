package week1;

public class ReverseWordsinaStringIII {
    public static void main(String[] args){
        System.out.println(reverseWords("This is a test"));
    }

    public static String reverseWords(String s) {
        StringBuffer sNew = new StringBuffer();
        String[] words = s.split(" ");
        for (String word:words){
            for (int i = word.length() - 1; i >= 0; i--) {
                sNew.append(word.charAt(i));
            }
            sNew.append(' ');
        }
        return sNew.substring(0, sNew.length() - 1);
    }
}
