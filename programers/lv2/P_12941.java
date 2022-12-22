package programers.lv2;

import java.util.Arrays;
import java.util.Collections;

public class P_12941 {
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Integer[] b = new Integer[B.length];

        for (int i = 0; i <B.length; i++) {
            b[i] = B[i];
        }
        Arrays.sort(A);
        Arrays.sort(b, Collections.reverseOrder());

        for (int i = 0; i <A.length ; i++) {
            int sum = A[i] * b[i];
            answer += sum;
        }

        return answer;
    }

    public static void main(String[] args) {
        P_12941 p = new P_12941();
        int[] a = {1, 2};
        int[] b = {3,4};
        System.out.println(p.solution(a,b));
    }
}
