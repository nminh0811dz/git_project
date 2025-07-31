import java.util.Scanner;

class P09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int rev = reverseNumber(x);
        if (isPalindrome(x)) {
            System.out.println(x + " is the palindrome number which the reverse is "+ rev);
        } else {
            System.out.println("none output");
        }
        sc.close();
    }


    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int rev = 0;
        int temp = x;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }
        return (rev == x);
    }

    public static int reverseNumber(int x) {
        if (x < 0) {
            return -1;
        }
        int rev = 0;
        int temp = x;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }
        return rev;
    }
}