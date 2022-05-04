package sort;

import java.util.Scanner;

public class BJ_2750 {
		public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);
			
			int N = in.nextInt();
			int arr[] = new int[N];
			
			
			for(int i = 0; i<arr.length ;i++) {
				
				arr[i] = in.nextInt();
			}
			
			for (int i = 0; i < arr.length-1; i++) {
				for (int j = 0; j < arr.length-i-1; j++) {
					int temp =0;
					if(arr[j]>arr[j+1]) {
						temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
			
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}

		}
}
