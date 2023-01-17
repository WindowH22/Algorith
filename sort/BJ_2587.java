package sort;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int total = 0;

        for (int i = 0; i <arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i <arr.length ; i++) {
            total += arr[i];
        }

        Arrays.sort(arr);

        //평균
        System.out.println(total/arr.length);
        //중앙값
        System.out.println(arr[2]);
    }
}
