package condition;

import java.util.Scanner;

public class BJ_2525 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		
		if((A>=0 && A<=24)&&(B>=0 && B<=59)) {
			if(B+C<60) {
			System.out.print(A + " ");
			System.out.println(B+C);
			}
			else if(B+C>=60) {
				int h = (B+C)/60;
				int H = A+h;
				int M = (B+C)%60;
				if(M == 60) {
					M = 0;
				}
				if(H >=24) {
					H = H%24;
				}
				System.out.print(H + " ");
				System.out.println(M);
			}
			
		}
	}
}
