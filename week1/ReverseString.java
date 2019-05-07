package week1;

public class ReverseString {
    public static void main(String[] args){
        char[] test = "Hello".toCharArray();
        reverseString(test);
        for (char c:test)
            System.out.println(c);
    }

    public static void reverseString(char[] s) {
        char temp;
        for (int left = 0, right = s.length - 1; left < right; left++, right--) {
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
        }
    }
}
