package String;

import java.util.Scanner;

public class BJ_9012 {
    public static void main(String[] args) {
        BJ_9012 T = new BJ_9012();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        for (String s : arr) {
            System.out.println(T.solution(s));
        }
    }

    private String solution(String s) {
        int n = 0;
        char[] ch = s.toCharArray();

        for (char c : ch) {
            if (c == '(') {
                n++;
            } else {
                n--;
            }

            if(n< 0){
                return "NO";
            }
        }
        if (n == 0) return "YES";
        else return "NO";
    }

}
