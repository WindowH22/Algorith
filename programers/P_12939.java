package programers;

public class P_12939 {
    public String solution(String s) {
        String[] ss = s.split(" ");

        int max = 0;
        int min = 0;

        for (int i = 0; i <ss.length ; i++) {
           if(max<Integer.valueOf(ss[i])){
               max = Integer.valueOf(ss[i]);
           }
        }

        for (int i = 0; i <ss.length ; i++) {
            if(min>Integer.valueOf(ss[i])){
                min = Integer.valueOf(ss[i]);
            }
        }

        String answer = "";

        answer = min+" "+max;
        return answer;
    }
}
