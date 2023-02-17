package programers.lv2;

public class P_17680 {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        String[] cache = new String[cacheSize];

        if(cache.length == 0) return cities.length*5;

        for(String s : cities){
            int pos = -1;

            for(int i = 0 ; i < cacheSize; i++){
                if(cache[i] ==null){

                }else if(cache[i].equalsIgnoreCase(s)){
                    pos = i;
                }

            }

            if(pos == -1){
                for (int i = cacheSize-1 ; i >=1 ; i--) {
                    cache[i] = cache[i-1];
                }
                cache[0] = s;
                answer += 5;
            }else{
                for (int i = pos; i >= 1 ; i--) {
                    cache[i] = cache[i-1];
                }
                cache[0] = s;
                answer += 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        P_17680 p = new P_17680();
        String[] s = {"Jeju", "Pangyo", "NewYork", "newyork"};
        System.out.println(p.solution(2,s));

    }
}
