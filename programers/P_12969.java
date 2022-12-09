package programers;

import java.util.Scanner;

public class P_12969 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[][] array = new int[b][a];

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
