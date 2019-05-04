public class PowerofTwo {
    public static void main(String[] args){
        System.out.println(Math.log(536870912)/Math.log(2));
        System.out.println(isPowerOfTwo(536870912));
        System.out.println(isPowerOfTwo(536870913));
    }

    public static boolean isPowerOfTwo(int n) {
        boolean isPowerOfTwo = false;
        if (n > 0){
            // with help from https://stackoverflow.com/questions/3305059/how-do-you-calculate-log-base-2-in-java-for-integers
            isPowerOfTwo = Math.pow(2, 31 - Integer.numberOfLeadingZeros(n)) == (double)n;
        }
        return isPowerOfTwo;
    }

}
