import java.util.Scanner;

class contributor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                int x = sc.nextInt();
                int[] input = new int[x];
                int output = 0;


                for (int i = 0; i < x; i++) {
                    input[i] = sc.nextInt();
                    output += input[i];
                }


                System.out.println("Sum of input numbers: " + output);

                sc.close();
            }
        }
