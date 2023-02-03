package programers.lv0;

public class P_120923 {
    public int[] solution(int num, int total) {
        int[] answer = {};

        for (int i = -(total + num); i <= (total + num); i++) {
            int sum = 0;
            int index = 0;
            answer = new int[num];
            for (int j = i; j < (i + num); j++) {
                sum += j;
                answer[index++] = j;
            }
            if (sum == total) {
                break;
            }
        }
        return answer;
    }
}
