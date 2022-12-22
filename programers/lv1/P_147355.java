package programers.lv1;

public class P_147355 {
    public int solution(String t, String p) {
        int count = 0;
        long lp = Long.parseLong(p);

        for (int i = p.length(); i <=t.length() ; i++) {
            if(Long.parseLong(t.substring(i-p.length(),i)) <= lp){
                count++;
            }

        }

        return count;
    }

    public static void main(String[] args) {
        P_147355 p = new P_147355();
        System.out.println(p.solution("10203","15"));
    }
}
