package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1003 {
	
	static int zero_count = 0;
	static int one_count = 0;
	static int N = 0;
	static StringBuilder sb = new StringBuilder();
	
		public static void main(String[] args) throws  IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			N = Integer.parseInt(br.readLine());
			
			for(int i = 0 ; i < N ; i++) {
				fibonacci(Integer.parseInt(br.readLine()));
				sb.append(zero_count).append(" ").append(one_count).append("\n");
				zero_count=0; one_count=0;
				}
				System.out.println(sb);
		
		}


	public static void fibonacci(int n) {
		if (n == 0) {
			zero_count++;
		} else if (n == 1) {
			one_count++;
		} else if (n < 0)
			return;
		else {
			fibonacci(n - 1);
			fibonacci(n - 2);
		}
	}
}