package programers.lv1;

import java.time.LocalDate;

public class P_12901 {
    public String solution1(int a, int b) {
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,30};

        int date = 0;
        for (int i = 0; i <a-1 ; i++) {
            date += month[i];
        }

        date += b - 1;

        return day[date%7];

    }

    public String solution2(int a, int b){
        return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0,3);
    }


    public static void main(String[] args) {
        P_12901 p = new P_12901();
        System.out.println(p.solution1(5,24));
        System.out.println(p.solution2(5,24));

    }
}
