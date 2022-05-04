package condition;

import java.util.Scanner;

public class BJ_2480 {
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		int dice1 = in.nextInt();
		int dice2 = in.nextInt();
		int dice3 = in.nextInt();
		int price = 0;
		
		if((dice1 == dice2)&&(dice1==dice3)) {
			price = 10000+dice1 * 1000;
			System.out.println(price);
		}else if((dice1==dice2 ||dice1==dice3)||(dice2 == dice3)) {
			if(dice1 ==dice2) {
				price = 1000+100 *dice1;
				System.out.println(price);
			}else if(dice1 == dice3) {
				price = 1000+100 * dice1;
				System.out.println(price);
			}else if(dice2 == dice3) {
				price = 1000+100 * dice2;
				System.out.println(price);
			}
		}else {
			int max = 0;
			if(dice1>max) max =dice1;
			if(dice2>max) max = dice2;
			if(dice3>max) max = dice3;
			price = max *100;
			System.out.println(price);
		}
	}
	
}
