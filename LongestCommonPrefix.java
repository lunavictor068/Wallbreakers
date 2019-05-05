public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] strings = new String[] {"a"};
        System.out.println(longestCommonPrefix(strings));
    }

    public static String longestCommonPrefix(String[] strs) {
        String prefix = "";
        boolean flag = strs.length > 0;
        int i = 0;
        while (flag){
            for (String s:strs){
                if (i > s.length() - 1){
                    flag = false;
                    break;
                }
            }
            for (int j = 0; j < strs.length - 1 && i < Math.min(strs[j].length(), strs[j + 1].length()); j++) {
                flag = flag && (strs[j].charAt(i) == strs[j + 1].charAt(i));
            }
            if (flag){
                prefix += strs[0].charAt(i);
            }
            i++;
        }
        return prefix;
    }
}
