import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arrays = new int[n];
        for (int i = 0; i < n; i++) {
            arrays[i] = scan.nextInt();
        }

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n-i-1 ; j++) {
                if(arrays[j]<arrays[j+1]) {
                    int temp = 0;
                    temp = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arrays[i]);
        }
    }
}
