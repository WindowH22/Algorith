package inflearn._1.programers;

public class P_12921 {
    public int solution(int n) {
        int answer = 0; // 정답 정의
        int[] arr = new int[n+1];   // int타입의 arr은 n+1개의 갯수만큼 int타입으로 공간을 가짐

        // 모든 수를 대입
        for(int i=0;i<=n;i++){  // int타입 i; 0부터 n이하까지 반복; i++
            arr[i]=i;   // arr의 i번째 방은 i이다
        }// 0번째 방은 =1, n-1번째 방은 =n이 된다

        // 1은 소수가 아니라서 0이라고 정의 --> 0이라고 함
        arr[1]=0;   // arr의 1번째 방은 0

        // 소수 찾기 시작
        for(int i=2;i<=n;i++){//2부터 계산해줌        int타입 i는 2; i가 n이하까지 반복; i++

            // 만약 이전에 찾았던 소수의 배수 값일 경우 계산없이 다음 수로 이동
            if(arr[i]==0)continue;  // arr[i]번째 방이 0이라면 반복문의 처음으로 이동

            // 에라토스테네스의 체를 통해 배수의 수는 소수가 아니라고 정의
            for(int j=i*2;j<=n;j+=i){   // int타입 j가 i*2이고; j가 n이하까지 반복; j = j+i -> 계산을 하지않고 소수가 아닌 값을 찾음
                arr[j]=0;   // arr의 j번째 방은 0 -> 소수가 아니라면
            }
        }

        // 정답 계산
        for(int i=0;i<arr.length;i++){  // int타입 i는 arr의 길이 미만동안 반복 i++
            if(arr[i]!=0){  // arr의 i번째 방이 0이 아니라면 -> 소수
                answer++;   // answer++
            }
        }
        return answer;
    }

    public boolean isPrime(int n){
        for (int i = 2; i < n; i++) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        P_12921 p = new P_12921();
        System.out.println(p.solution(10));
    }

}
