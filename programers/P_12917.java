package programers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class P_12917 {
    public String solution(String s) {
        char arr [] = s.toCharArray();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder(new String(arr,0,arr.length));
        return sb.reverse().toString();
    }
}
