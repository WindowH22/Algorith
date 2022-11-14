package programers;

public class P_86051 {

    public int solution(int[] numbers) {

        int total = 0;
        int answer = 45;

        for (int i = 0; i <numbers.length ; i++) {
            total += numbers[i];
        }
        answer -= total;

        return answer;
    }

    public static void main(String[] args) {
        P_86051 p = new P_86051();

        int[] numbers = {1,2,3,4,6,7,8,0};
        System.out.println(p.solution(numbers));
    }
}
