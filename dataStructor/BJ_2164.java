package dataStructor;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ_2164 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		//logic
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 0; i<N ; i++) {
			queue.add(i+1);
		}
		
		//shuffle
		int count = 1; //몇 번째 시행인지 알기 위한 카운트
		while(queue.size()!= 1) {
			int q = queue.poll();			
			//짝수 시행이면 
			if ( count % 2 == 0) {
				queue.offer(q);
			}
			count++;
		}
		
		System.out.println(queue.peek());
		
		
	}
}
