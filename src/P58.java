import java.util.Scanner;

public class P58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int output = lengthOfLastWord(s);
        System.out.println(output);
        sc.close();
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int length = 0;
        for (int i = 0; i < s.length() - 1; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else if (length > 0) {
                break;
            }
        }
        return length;
    }
}
