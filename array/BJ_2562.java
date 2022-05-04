package array;

import java.util.Scanner;

public class BJ_2562 {

	public static void main(String[] args) {
		int [] array = new int[9];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i= 0; i<array.length; i ++ ) {
			array[i] = scanner.nextInt();
		}
		
		
		int max= 0;
		int index = 0;
		for(int i = 0 ; i<array.length; i++ ) {
			
			if(array[i] > max) {
				max = array[i];
				index = i+1;
			}
		}
		
		
		System.out.println(max);
		System.out.println(index);
		
	}

}
