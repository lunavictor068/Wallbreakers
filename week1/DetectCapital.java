package week1;

public class DetectCapital {
    public static void main(String[] args){
        System.out.println(detectCapitalUse("oOO"));
        System.out.println(detectCapitalUse("OOO"));
        System.out.println(detectCapitalUse("Ooo"));
        System.out.println(detectCapitalUse("O"));
        System.out.println(detectCapitalUse("ooo"));
        System.out.println(detectCapitalUse("LeeTCode"));
    }

    public static boolean detectCapitalUse(String word) {
        char[] chars = word.toCharArray();
        boolean correctUsage = true;
        if (Character.isUpperCase(chars[0])){
            // all must be equal
            for (int i = 1; i < chars.length - 1; i++) {
                correctUsage = correctUsage && Character.isUpperCase(chars[i]) == Character.isUpperCase(chars[i + 1]);
            }
        }
        else {
            // all must be lowercase
            for (int i = 1; i < chars.length; i++) {
                correctUsage = correctUsage && Character.isLowerCase(chars[i]);
            }
        }
        return correctUsage;
    }
}
