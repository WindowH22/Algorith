package inflearn._1.programers;

// 제일 작은 수 제거하기
public class P_12935 {
    public int[] solution(int[] arr) {

        if(arr.length ==1){
            int [] answer = {-1};
            return answer;
        }

        int[] answer = new int[arr.length-1];

        int min = arr[0];

        for(int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

        int index = 0;
        for (int i = 0; i <arr.length ; i++) {

            if(arr[i] ==min){
                continue;
            }
            answer[index++] = arr[i];
        }

        return answer;

    }

    public static void main(String[] args) {
        P_12935 p = new P_12935();
        int[] arr = {1};
        p.solution(arr);
    }
}
