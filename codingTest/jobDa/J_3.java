package codingTest.jobDa;

import java.util.Arrays;
import java.util.TreeSet;

public class J_3 {
    public long solution(int n, int[] a, int[] b) {
        long answer = 0;

        int[] c = new int[n * 2];
        int[] d = new int[n * 2];
        for (int i = 0; i < n; i++) {
            c[i * 2] = a[i];
            d[i * 2] = b[i];
            c[i * 2 + 1] = b[i];
            d[i * 2 + 1] = a[i];
        }

        Integer[] idx = new Integer[n * 2];
        for (int i = 0; i < n * 2; i++) {
            idx[i] = i;
        }
        Arrays.sort(idx, (i, j) -> {
            if (c[i] != c[j]) {
                return Integer.compare(c[i], c[j]);
            } else {
                return Integer.compare(d[i], d[j]);
            }
        });

        TreeSet<Integer> set = new TreeSet<>();
        set.add(-1);
        set.add(n * 2);
        for (int i = 0; i < n * 2; i++) {
            int j = idx[i];
            if (j == 0 || j == n*2-1) {
                continue;
            }
            if (set.contains(j)) {
                set.remove(j);
            } else {
                int k = set.lower(j);
                int l = set.higher(j);
                if (k >= -1 && l <= n * 2) {
                    int area = (c[j] + c[k]) * getMax(d, k, l - 1);
                    answer = Math.max(answer, area);
                }
                set.add(j);
            }
        }

        return answer;
    }

    private int getMax(int[] a, int l, int r) {
        int max = 0;
        for (int i = l; i <= r; i++) {
            max = Math.max(max, a[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        J_3 j = new J_3();
        int[] a = {3, 4};
        int[] b = {4, 5};
        System.out.println(j.solution(2, a, b)); // prints 32
    }
}
