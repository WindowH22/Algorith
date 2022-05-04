package array;

import java.util.Scanner;

public class BJ_4344 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[] arr;
		
		int testcase = in.nextInt();
		
		for (int i = 0; i < testcase; i++) {
			// ?•™?ƒ?ˆ˜ ë°›ê¸°
			int N = in.nextInt();
			arr = new int[N];
			
			double sum = 0;
			
			// ? ?ˆ˜ ?ž…? ¥
			for(int j = 0; j<arr.length;j++) {
				arr[j] = in.nextInt();
				sum += arr[j];
			}
			
			double avg = (sum/N);
			double count =0;
			
			for (int j = 0; j < arr.length; j++) {
				if(avg<arr[j]) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n",(count/N)*100);
		}
		in.close();
		
	}
}
