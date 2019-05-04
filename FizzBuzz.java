import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args){
        for (String i:fizzBuzz(15)){
            System.out.println(i);
        }
    }

    public static List<String> fizzBuzz(int n) {
        List<String> fizzbuzz = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0){
                fizzbuzz.add("FizzBuzz");
            }
            else if (i % 3 == 0){
                fizzbuzz.add("Fizz");
            }
            else if (i % 5 == 0){
                fizzbuzz.add("Buzz");
            }
            else
                fizzbuzz.add(Integer.toString(i));
        }
        return fizzbuzz;
    }
}