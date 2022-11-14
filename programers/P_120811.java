package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class P_120811 {
    public int solution(int[] array){

        ArrayList<Integer> arrayList = new ArrayList<>();
        for( int i : array){
            arrayList.add(i);
        }
        arrayList.sort(Comparator.naturalOrder());
        arrayList.get((arrayList.size()/2)+1);
        int answer = 0 ;
        return answer;
    }
}
