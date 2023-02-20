package sorting;

import java.util.Scanner;

public class BJ_10989 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i <arr.length ; i++) {
            int tmp = arr[i];
            int j;
            for (j = i-1; j >=0  ; j--) {
                if(tmp <= arr[j]) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = tmp;
        }

        for(int num : arr){
            System.out.println(num);
        }

    }
}
