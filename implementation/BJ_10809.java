package implementation;

import java.util.Scanner;

public class BJ_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alphabet =sc.next();

        String alpha = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i <alpha.length() ; i++) {
            System.out.print(alphabet.indexOf(alpha.charAt(i)) + " ");
        }
    }
}
