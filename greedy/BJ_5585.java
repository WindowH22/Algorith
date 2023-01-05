package greedy;

import java.util.Scanner;

public class BJ_5585 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = 1000-sc.nextInt();
        int[] coin = {500,100,50,10,5,1};
        int count = 0;

        for(int i :coin){
            count += money/i;
            money = money%i;
        }

        System.out.println(count);
    }

}
