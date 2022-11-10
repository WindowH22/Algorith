package inflearn._1;

import java.util.*;
import java.util.Scanner;

public class _1 {

    public int solution(String str,char t){
        int answer = 0;

        for(int i = 0 ; i<str.length(); i++){
            if(t == str.charAt(i)){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        _1 T = new _1();
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        char c = sc.next().charAt(0);
        System.out.println(T.solution(str,c));

    }
}
