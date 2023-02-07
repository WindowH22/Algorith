package programers.lv0;

public class P_120863 {

    public String solution(String polynomial){
        String answer = "";
        int x = 0;
        int n = 0;
        String[] poly = polynomial.split(" ");

        for(String s : poly){
            if(s.contains("x")){
                s = s.substring(0,s.indexOf("x"));
                if(s.isBlank()){
                    x += 1;
                }else{
                    x = x + Integer.parseInt(s);
                }
            }else if(!s.equals("+")){
                n = n + Integer.parseInt(s);
            }
        }

        if(n == 0){
            if(x == 1){
                answer = "x";
            }else{
                answer = x + "x";
            }
        }else if(x == 0){
            answer = answer + n;
        }else{
            if(x == 1){
                answer = "x + " + n;
            }else{
                answer = x + "x + " + n;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        P_120863 p  = new P_120863();
        System.out.println(p.solution("3x + 7 + x"));
        System.out.println(p.solution("x + x + x"));
        System.out.println(p.solution("7 + x + 7"));
        System.out.println(p.solution("7 + 7"));
        System.out.println(p.solution("1x + 1x + 1x + 3"));
    }
}
