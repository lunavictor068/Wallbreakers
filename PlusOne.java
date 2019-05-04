import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args){
        int[] test = new int[] {9, 9, 9, 9};
        for (int i : plusOne(test))
            System.out.println(i);
    }

    public static int[] plusOne(int[] digits) {
        int carry = 0;
        digits[digits.length - 1]++;
        for (int i = digits.length - 1; i >= 0; i--) {
            int number = digits[i] + carry;
            carry = 0;
            if (number > 9){
                carry = 1;
                number = number - 10;
            }
            digits[i] = number;
        }
        if (carry > 0){
            int[] toCopy = new int[digits.length + 1];
            System.arraycopy(digits, 0, toCopy, 1, digits.length);
            toCopy[0] = carry;
            digits = toCopy;
        }
        return digits;
    }


}
