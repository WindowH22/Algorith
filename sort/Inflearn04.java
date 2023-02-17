package sort;

import java.util.Scanner;

public class Inflearn04 {

    public int[] solution(int size , int n, int[] arr){
        int[] cache = new int[size];

        for(int x : arr){
            int pos = -1; // cacheMiss이면 -1, Hit이면 Hit인 위치를 넣는다.
            for(int i = 0; i<size; i++){
                // cacheHit
                if(x == cache[i] ) {
                    pos = i;
                }
            }
            if(pos == -1){ // 처음부터 삽입정렬 실행
                for(int i = size - 1; i>=1 ; i--){
                    cache[i] = cache[i-1];
                }
                cache[0] = x;
            }
            else{ // 해당 위치부터 삽입정렬 수행
                for(int i = pos; i>=1 ; i--){
                    cache[i] = cache[i-1];
                }
                cache[0] = x;
            }
        }




        return cache;
    }

    public static void main(String[] args) {
        Inflearn04 T = new Inflearn04();

        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <arr.length ; i++) arr[i] = sc.nextInt();
        for (int x : T.solution(s, n, arr)) System.out.print(x + " ");

    }
}
