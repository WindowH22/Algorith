package programers.lv1;
class Solution {
    //        0부터 9까지 좌표 {y,x}
    int[][] numpadPos = {
            {3,1}, //0
            {0,0}, //1
            {0,1}, //2
            {0,2}, //3
            {1,0}, //4
            {1,1}, //5
            {1,2}, //6
            {2,0}, //7
            {2,1}, //8
            {2,2}  //9
    };
    //초기 위치
    int[] leftPos = {3,0};
    int[] rightPos = {3,2};
    String hand;
    public String solution(int[] numbers, String hand) {
        this.hand = (hand.equals("right")) ? "R" : "L";

        String answer = "";
        for (int num : numbers) {
            String Umji = pushNumber(num);
            answer += Umji;

            if(Umji.equals("L")) {leftPos = numpadPos[num]; continue;}
            if(Umji.equals("R")) {rightPos = numpadPos[num]; continue;}
        }
        return answer;
    }

    //num버튼을 누를 때 어디 손을 사용하는가
    private String pushNumber(int num) {
        if(num==1 || num==4 || num==7) return "L";
        if(num==3 || num==6 || num==9) return "R";

        // 2,5,8,0 일때 어디 손가락이 가까운가
        if(getDist(leftPos, num) > getDist(rightPos, num)) return "R";
        if(getDist(leftPos, num) < getDist(rightPos, num)) return "L";

        //같으면 손잡이
        return this.hand;
    }

    //해당 위치와 번호 위치의 거리
    private int getDist(int[] pos, int num) {
        return Math.abs(pos[0]-numpadPos[num][0]) + Math.abs(pos[1]-numpadPos[num][1]);
    }
}
public class P_62756 {

    public String solution(int[] numbers, String hand){
        String answer = "";
        int left = 10;
        int right = 12;

        for(int tmp : numbers){
            if(tmp == 0) tmp = 11;
            // 1,3,7
            if(tmp == 1 || tmp == 4 || tmp == 7){
                answer += "L";
                left = tmp;
            }
            // 3,6,9
            else if(tmp == 3 || tmp == 6 || tmp == 9){
                answer += "R";
                right =tmp;
            }else{
                int leftDist = Math.abs(left-tmp)/3 + Math.abs(left-tmp)%3;
                int rightDist = Math.abs(right-tmp)/3 + Math.abs(right-tmp)%3;

                if(rightDist < leftDist){
                    answer += "R";
                    right = tmp;
                }else if(rightDist > leftDist){
                    answer  += "L";
                    left = tmp;
                }else {
                    if(hand.equals("right") ) {
                        answer += "R";
                        right = tmp;
                    }else{
                        answer += "L";
                        left = tmp;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        P_62756 p = new P_62756();
        Solution p1 = new Solution();

        int [] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String str = new String("right");

        System.out.println(p1.solution(numbers,str));
//        System.out.println(p.solution(numbers,str));
    }
}
