package inflearn._1;

import java.util.Scanner;

public class _2 {
    public String solution(String str){
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            int tmp = (int)str.charAt(i);
            if(65<= tmp && tmp<=90 ){
               output += (char)(tmp+32);
            } else if (97<= tmp && tmp <=122) {
                output += (char)(tmp-32);
            }

        }
        return output;
    }

    public static void main(String[] args) {
        _2 T = new _2();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));


    }
}
