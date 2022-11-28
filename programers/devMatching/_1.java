package programers.devMatching;

public class _1 {
    public int solution(int low, int high, String[] img){
        //가장자리 칸이 검은색
        // low <= (k/((n-2)*(n-2))) *100 < high

        char[][] chars = new char[img.length][img[0].length()];
        // 가장자리가 검은색인지 부터
        for (int i = 0; i <img.length ; i++) {
            for (int j = 0; j <img.length ; j++) {
                chars[i][j]= img[i].charAt(j);
            }
        }




        int answer = 0 ;
        return answer;
    }
}
