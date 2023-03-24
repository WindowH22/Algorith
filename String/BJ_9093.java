package String;

import java.util.Scanner;

public class BJ_9093 {
    public static void main(String[] args) {
        BJ_9093 T = new BJ_9093();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }

        T.solution(arr);

    }

    private void solution(String[] arr) {
        for (String s : arr) {
            String[] strings = s.split(" ");

            for (int i = 0; i < strings.length ; i++) {
                String tmp = new StringBuilder(strings[i]).reverse().toString();
                strings[i] = tmp;
                System.out.print(strings[i] + " ");
            }
            System.out.println();
        }

    }
}
