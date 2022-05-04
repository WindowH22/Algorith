package condition;

import java.util.Scanner;

public class BJ_2884 {
	
	public static void main(String[] args) {
		
		Scanner in  = new Scanner(System.in);

		int H = in.nextInt();
		int M = in.nextInt();
		
		if((0<=H && H<=24)&&(0<= M && M<=59)) {
			if(M>=45) {
				System.out.print(H+" ");
				System.out.println(M-45);
			}else if(H ==0 &&M<45) {
				H = 23;
				System.out.print(H+" ");
				System.out.println(60+M-45);
			}
			else {
				System.out.print(H-1+" ");
				System.out.println(60+M-45);
			}
			
		}
	}
}
