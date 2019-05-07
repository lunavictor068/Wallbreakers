package week1;

public class NumberComplement {
    public static void main(String[] args){
        System.out.println(findComplement(5));
    }

    public static int findComplement(int num) {
        char[] binary = Integer.toBinaryString(num).toCharArray();
        for (int i = 0; i < binary.length; i++) {
            if (binary[i] == '1'){
                binary[i] = '0';
            }
            else {
                binary[i] = '1';
            }
        }
        return Integer.parseInt(new String(binary), 2);
    }
}
