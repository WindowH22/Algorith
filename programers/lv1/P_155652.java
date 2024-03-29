package programers.lv1;

public class P_155652 {

    public String solution(String s, String skip, int index) {
        char[] words = s.toCharArray();
        for(int i = 0 ; i < words.length ; i++){
            for(int j = 0 ; j < index ; j++){
                do{
                    words[i]++;
                    if(words[i] > 'z'){ //범위 초과시 a로 돌아옴
                        words[i] -= 26; // == 'a'와 동일
                    }
                }while(skip.contains(String.valueOf(words[i])));
            }
        }
        String answer = String.valueOf(words);
        return answer;
    }

    public static void main(String[] args) {
        P_155652 p = new P_155652();
        System.out.println(p.solution("x", "wbqd",5));
    }
}
