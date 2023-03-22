package array;

import java.util.Scanner;

public class 보이는학생 {

    public static void main(String[] args) {

        보이는학생 T = new 보이는학생();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(arr));
    }

    public int solution(int[] arr) {
        int answer = 0;
        int tall = 0;

        for (int i = 0; i < arr.length ; i++) {
            if( tall < arr[i] ){
                answer++;
                tall = arr[i];
            }
        }
        return answer;
    }
}
