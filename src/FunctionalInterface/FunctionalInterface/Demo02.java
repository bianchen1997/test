package FunctionalInterface.FunctionalInterface;

import java.util.Random;
import java.util.function.Supplier;

public class Demo02 {
    public static int getMax(Supplier<Integer> supplier) {
        return supplier.get();
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        System.out.println(getMax(()->{

            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]>max)
                    max = arr[i];
            }
            return max;
        }));
    }
}
