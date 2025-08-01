import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class P013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int total = convertedInt(x);
        System.out.println(" the output of this Roman Integer is " + total);
    }

    public static int convertedInt(String x) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    
        int total = 0;
        int prev = 0;


        for (int i = x.length() - 1; i >= 0; i--) {
            int curr = map.get(x.charAt(i));
            if (curr < prev) {
                total -= curr;
            } else {
                total += curr;
            }
            prev = curr;
        }
        return total;
    }
}