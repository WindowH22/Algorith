package programers.lv1;

import java.util.ArrayList;
import java.util.Stack;

public class P_133502 {


    // 시간초과
    public int solution(int[] ingredient) {
        ArrayList<Integer> arr = new ArrayList<>();
        int answer = 0;

        for (int a: ingredient) {
            arr.add(a);
        }

        if(arr.size() > 3){
            for (int i = 3; i <arr.size() ; i++) {
                if( arr.get(i-3) == 1 && arr.get(i-2)== 2 && arr.get(i-1)==3 && arr.get(i)==1){
                    answer ++;
                    arr.remove(i-3);
                    arr.remove(i-3);
                    arr.remove(i-3);
                    arr.remove(i-3);

                    i = 3;
                }
            }
        }

        return answer;
    }

    public int solution1(int[] ingredient){
        int answer =0;
        Stack<Integer> stack = new Stack<>();

        for(int a : ingredient) {
            stack.push(a);


            if (stack.size() >= 4) {
                if (stack.get(stack.size() - 4) == 1
                        && stack.get(stack.size() - 3) == 2
                        && stack.get(stack.size() - 2) == 3
                        && stack.get(stack.size() - 1) == 1) {
                    answer++;
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {

        P_133502 p = new P_133502();
        int[] ingredient1 = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int[] ingredient2 = {1, 3, 2, 1, 2, 1, 3, 1, 2};
        System.out.println(p.solution1(ingredient1));

    }
}
