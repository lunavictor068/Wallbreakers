public class ValidPalindrome {
    public static void main(String[] args){
        System.out.println(isPalindrome("HelloolleH"));
        System.out.println(isPalindrome("HelloolleH"));
        System.out.println(isPalindrome("Aaaa.. a..a. a aab"));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        boolean isPalindrome = true;
        for (int left = 0, right = s.length() - 1; left < right; left++, right--) {
            char currentLeft = s.charAt(left);
            char currentRight = s.charAt(right);
            // skip non alphanumeric
            while (!(Character.isAlphabetic(currentLeft) || Character.isDigit(currentLeft))){
                left++;
                // no more characters
                if (left >= right){
                    break;
                }
                currentLeft = s.charAt(left);
            }
            while (!(Character.isAlphabetic(currentRight) || Character.isDigit(currentRight))){
                right--;
                // no more characters
                if (left >= right){
                    break;
                }
                currentRight = s.charAt(right);
            }
            // no more characters
            if (left >= right){
                break;
            }
            if (s.charAt(left) != s.charAt(right)){
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
