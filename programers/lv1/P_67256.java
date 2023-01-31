package programers.lv1;

public class P_67256 {
    public String solution(int[] numbers, String hand) {

        String answer = "";
        int left = 10;
        int right = 12;

        for (int tmp: numbers){
            if(tmp == 0){
                tmp = 11;
            }

            if(tmp ==1|| tmp  ==4 || tmp ==7){
                answer += "L";
                left = tmp;
            }else if(tmp ==3|| tmp  ==6 || tmp ==9){
                answer += "R";
                right = tmp;
            }else{
                int leftDist = Math.abs(tmp-left)/3 + Math.abs(tmp-left)%3;
                int rightDist = Math.abs(tmp-right)/3 + Math.abs(tmp-right)%3;

                if(rightDist < leftDist){
                    answer+="R";
                    right = tmp;
                } else if (leftDist < rightDist) {
                    answer+="L";
                    left = tmp;
                }else if(rightDist == leftDist){
                    if(hand =="right"){
                        answer+= "R";
                        right = tmp;
                    }else{
                        answer+= "L";
                        left = tmp;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        P_67256 p = new P_67256();
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(p.solution(numbers,hand));
    }
}
