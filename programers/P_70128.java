package programers;

import java.util.stream.IntStream;

public class P_70128 {
    public int solution(int[] a, int[] b) {
        return IntStream.range(0,a.length).map(index -> a[index] *b[index]).sum();
    }

    public static void main(String[] args) {
        P_70128 p = new P_70128();

        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};
        System.out.println(p.solution(a,b));
    }
}
