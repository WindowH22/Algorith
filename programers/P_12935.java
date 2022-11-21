package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

// 제일 작은 수 제거하기
public class P_12935 {
    public int[] solution(int[] arr) {

        ArrayList<Integer> nums=new ArrayList<>();
        int[] answer = new int[arr.length];

        if(arr.length>1){

            for (int i = 0; i <arr.length ; i++) {
                nums.add(arr[i]);
            }
            nums.sort(Comparator.reverseOrder());

            answer = new int[arr.length-1];
            for (int i = 0; i <answer.length ; i++) {
                answer[i] = nums.get(i);
            }
        }
        else{
            answer[0] = -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        P_12935 p = new P_12935();
        int[] arr = {1};
        p.solution(arr);
    }
}
