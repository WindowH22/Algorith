package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class P_1845 {

    public int solution(int[] nums) {
        int max = nums.length/2;
        int answer = 0;
        ArrayList<Integer> type = new ArrayList<>();

        for (int i = 0; i <nums.length ; i++) {
            if(!type.contains(nums[i])) {
                type.add(nums[i]);
            }
        }

        answer=  type.size()<max?type.size():max;

        if(type.size()<max){
            answer = type.size();
        }else{
            answer = max;
        }

        return answer;
    }
}
