package condition;

import java.util.Scanner;

public class BJ_14681 {
		public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);
			
			//x,y 값 받기
			int x = in.nextInt();
			int y = in.nextInt();
			
			
			// 해당사분면 출력
			if((x >= -1000 && x <= 1000)&&(y >= -1000 && y <= 1000)) {
				if(x>0 && y>0 ) {
					System.out.println(1);
				}else if(x<0 && y>0){
					System.out.println(2);
				}else if(x<0 && y<0){
					System.out.println(3);
				}else if(x>0 && y<0){
					System.out.println(4);
				}
			}
			
		}	
}
