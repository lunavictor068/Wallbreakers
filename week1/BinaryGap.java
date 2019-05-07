import java.util.ArrayList;
import java.util.List;

public class BinaryGap {
    public static void main(String[] args){
        System.out.println(binaryGap(5));
        System.out.println(binaryGap(6));
    }

    public static int binaryGap(int N) {
        char[] binary = Integer.toBinaryString(N).toCharArray();
        List<Integer> positions = new ArrayList<>();
        for (int i = 0; i < binary.length; i++) {
            if (binary[i] == '1'){
                positions.add(i);
            }
        }
        int maxGap = 0;
        for (int i = 0; i < positions.size() - 1; i++) {
            maxGap = Math.max(maxGap, positions.get(i + 1) - positions.get(i));
        }
        return maxGap;
    }
}
