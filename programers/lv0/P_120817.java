package programers.lv0;

import java.util.Arrays;

public class P_120817 {
    public double solution(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }
}
