package inflearn._1;

import java.util.Scanner;

public class _2 {
    public String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
            else answer+= Character.toLowerCase(x);
        }

        return answer;
    }

    public static void main(String[] args) {
        _2 T = new _2();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));


    }
}
