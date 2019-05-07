package week1;

public class HammingDistance {
    public static void main (String[] args){
        System.out.println(hammingDistance(1, 4));
    }

    public static int hammingDistance(int x, int y) {
        int hDistance = 0;
        char[] xBinary = Integer.toBinaryString(x).toCharArray();
        char[] yBinary = Integer.toBinaryString(y).toCharArray();
        for (int i = 0; i < Math.min(xBinary.length, yBinary.length); i++) {
            if (xBinary[xBinary.length - 1 - i] != yBinary[yBinary.length - 1 - i]){
                hDistance++;
            }
        }
        if (xBinary.length > yBinary.length){
            int difference = xBinary.length - yBinary.length;
            for (int i = difference - 1; i >= 0; i--) {
                if (xBinary[i] == '1'){
                    hDistance++;
                }
            }
        }
        else {
            int difference = yBinary.length - xBinary.length;
            for (int i = difference - 1; i >= 0; i--) {
                if (yBinary[i] == '1'){
                    hDistance++;
                }
            }
        }
        return hDistance;
    }
}
