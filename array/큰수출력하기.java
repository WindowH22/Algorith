package array;

import java.util.Scanner;

public class 큰수출력하기 {

    public void solution(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (i != 0) {
                if (arr[i - 1] < arr[i]) {
                    System.out.print(arr[i] + " ");
                }
            } else {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        큰수출력하기 T = new 큰수출력하기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        T.solution(arr);
    }
}
