package programers.lv0;

public class P_120818 {
    public int solution(int price) {

        if(price >= 100000 && price  <=300000){
            price = price - (int)(price * 0.05);
        }else if(price >= 300000 && price <= 500000){
            price = price - (int)(price * 0.1);
        }else if(price >= 500000){
            price = price - (int)(price *0.2);
        }

        return (int)price;
    }

    public static void main(String[] args) {
        P_120818 p = new P_120818();
        System.out.println(p.solution(580000));

        System.out.println(p.solution(10));
        System.out.println(p.solution(1000000));

    }
}
