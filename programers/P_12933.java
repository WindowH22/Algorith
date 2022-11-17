package programers;

import java.util.Arrays;

public class P_12933 {
    public long solution(long n) {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        String[] ss = sb.toString().split("");

        long [] numbers = new long[ss.length];

        for (int i = 0; i <numbers.length ; i++) {
            numbers[i] = (long)Integer.parseInt(ss[i]);
        }
        //정렬
        Arrays.sort(numbers);

        long answer = 0;
        long index = 1;
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i]*index;
            index *= 10;
        }
        return answer;
    }
}
