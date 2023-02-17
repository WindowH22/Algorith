package sort;


import java.util.Arrays;
import java.util.Scanner;

public class Inflearn06 {

    public int[] solution(int[] arr){
        int[] tmp = arr.clone();
        Arrays.sort(tmp);

        int[] answer = new int[2];
        int idx = 0;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] != tmp[i]) {
                answer[idx] = i+1;
                idx ++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Inflearn06 T = new Inflearn06();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }

        for(int x : T.solution(arr)){
            System.out.print(x+ " ");
        }

    }
}
