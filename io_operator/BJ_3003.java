package io_operator;

import java.util.Scanner;

public class BJ_3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] chess = {1,1,2,2,2,8};
        int[] arr = new int[chess.length];

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = chess[i] - sc.nextInt();
            System.out.print(arr[i]+" ");
        }

    }
}
