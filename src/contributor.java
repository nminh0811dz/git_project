import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số nguyên x
        int x = sc.nextInt();
        int[] input = new int[x];
        int output = 0;

        for (int i = 0; i < x; i++) {
            input[i] = sc.nextInt();
            output += input[i];
        }

        // In kết quả
        System.out.println("Sum of input numbers: " + output);

        sc.close();
    }
}