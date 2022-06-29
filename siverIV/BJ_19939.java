package siverIV;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BJ_19939 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());

		// 공 갯수
		int N = Integer.parseInt(st.nextToken());
		// 바구니 수
		final int K = Integer.parseInt(st.nextToken());

		for (int i = 1; i < K + 1; i++) {
			N -= i;
			if (N < 0) {
				break;
			}
		}
		if (N >= 0) {
			if (N % K > 0) {
				sb.append(K);
			} else {
				sb.append(K-1);
			}
		} else {
			sb.append(-1);
		}
		
		sb.append("\n");
		
		bw.write(sb.toString());
		
		bw.flush();
		br.close();
		bw.close();
	
	}
}

