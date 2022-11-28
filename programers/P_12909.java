package programers;


import java.util.Stack;

public class P_12909 {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> st = new Stack<>();
        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
            if(c == '('){
                st.push(c);
            }
            else if(c ==')'){
                if(st.size() == 0){
                    return false;
                }else{
                    st.pop();
                }
            }
        }
        if(st.size() != 0) {
            answer = false;
        }
        return answer;
    }
}
