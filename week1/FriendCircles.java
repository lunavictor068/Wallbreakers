package week1;

import java.util.ArrayList;
import java.util.HashSet;

public class FriendCircles {
    public static void main(String[] args){
        int[][] test = new int[][] {{1,0,0,1},{0,1,1,0},{0,1,1,1},{1,0,1,1}};
        System.out.println(findCircleNum(test));
    }

    public static int findCircleNum(int[][] M) {
        ArrayList<HashSet<Integer>> circles = new ArrayList<>();
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (M[i][j] == 1){
                    boolean foundCircle = false;
                    boolean foundICircle = false;
                    HashSet<Integer> ICircle = null;
                    boolean foundJCircle = false;
                    HashSet<Integer> JCircle = null;
                    for (HashSet<Integer> circle:circles){
                        if (circle.contains(i)){
                            circle.add(j);
                            ICircle = circle;
                            foundICircle = true;
                            foundCircle = true;
                        }
                        else if (circle.contains(j)){
                            circle.add(i);
                            JCircle = circle;
                            foundJCircle = true;
                            foundCircle = true;
                        }
                    }
                    if (foundICircle && foundJCircle){
                        // combine
                        ICircle.addAll(JCircle);
                        circles.remove(JCircle);
                    }
                    if (!foundCircle){
                        HashSet<Integer> circle = new HashSet<>();
                        circle.add(i);
                        circle.add(j);
                        circles.add(circle);
                    }
                }
            }
        }
        return circles.size();
    }
}
