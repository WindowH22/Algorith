package math;

import java.util.Scanner;

public class Bj_10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[a];
		
		for(int i=0 ; i< arr.length;i++ ) {
			 arr[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i =0; i<arr.length; i++) {
			if(arr[i]< n) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
