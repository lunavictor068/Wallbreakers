public class ExcelSheetColumnNumber {
    public static void main(String[] args){
        System.out.println(titleToNumber("ZY"));
    }

    public static int titleToNumber(String s) {
        char[] chars = s.toCharArray();
        int number = 0;
        for (int i = 0; i < chars.length; i++) {
            int n = Character.getNumericValue(chars[chars.length - 1 - i]) - 9;
            number += n * Math.pow(26, i);
        }
        return number;
    }
}
