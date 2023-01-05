package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_2217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int[] k = new int[w];


        for (int i = 0; i < w ; i++) {
            k[i] = sc.nextInt();
        }

        Arrays.sort(k);

        long max = 0 ;

        for (int i = w-1; i >= 0; i--) {
            k[i] = k[i] * (w-i);
            if(max < k[i]) max = k[i];
        }

        System.out.println(max);
    }

}
