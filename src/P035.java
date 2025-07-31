import java.util.Scanner;

class P035 {
    public static int searchIndex(int[] arr, int input ) {


        int j = 0;
        for(int i= 0; i<= arr.length;i++ ) {
            if (input == arr[i]){
                return i ;
            }
            if(input > arr[i]){
                j = i+1;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int j = sc.nextInt();
//        int output = searchIndex(j);

    }
}