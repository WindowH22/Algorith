package array;

import java.util.Scanner;

public class BJ_1546 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double scoreArray[] = new double[scan.nextInt()];
		double max = 0;
		double sum = 0;
		double avg = 0;
		
		for(int i = 0; i<scoreArray.length;i++) {
			scoreArray[i] = scan.nextDouble();
		}

		for(int i = 0; i<scoreArray.length;i++) {
			if(max<scoreArray[i]) {
				max = scoreArray[i];
			}			
		}
			
		for (int i = 0; i < scoreArray.length; i++) {
			sum += (scoreArray[i]/max)*100 ;		
		}
		
		avg = sum/scoreArray.length;
		System.out.println(avg);
	}
}
