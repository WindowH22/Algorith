package programers;

import java.util.Arrays;

public class P_120812 {
    public int solution(int[] array) {
        Arrays.sort(array);
        int answer = 0;
        int[] index = new int[array.length];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i <array.length ; i++) {
            index[array[i]]++;
        }
        for(int i = 0; i<index.length; i++) {
            if(index[i] > max) { // 최대값 구하기
                max = index[i];
                answer = i;
            } else if (index[i] == max) {
                answer = -1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        // 최빈값 알고리즘(Mode Algorithm)
        // 주어진 데이터에서 가장 많이 나온(중복된) 값
        int[] arr = {1, 1,2,2};
        int answer = 0; // 최빈값
        int[] index = new int[5 + 1]; // 값별 갯수(COUNT) 저장
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++) {
            index[arr[i]]++; // 값별 인덱스에 COUNT 추가
        }

        for(int i = 0; i<index.length; i++) {
            if(index[i] > max) { // 최대값 구하기
                max = index[i];
                answer = i;
            }else if (index[i] == max) {
                answer = -1;
            }
        }

        System.out.println("ANSWER : " + answer + " COUNT : " + max);
    }
}
