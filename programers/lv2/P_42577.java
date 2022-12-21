package programers.lv2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P_42577 {
    public boolean solution(String[] phone_book) {
        // 1. phoneBook을 sorting한다.
        Arrays.sort(phone_book);

        // 2. 1중 Loop을 돌며 앞 번호가 뒷 번호의 접두어인지 확인한다.
        for (int i = 0; i < phone_book.length - 1; i++)
            if (phone_book[i + 1].startsWith(phone_book[i]))
                return false;

        // 3. 여기까지 오면 접두어가 없다는 것이다.
        return true;
    }

    public boolean solution2(String[] phone_book) {
        boolean answer = true;

        Map<String, String> map = new HashMap<>();

        for(int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], "prefix");
        }

        for(String s : phone_book) {
            for(int i = 1; i < s.length(); i++) {
                if(map.containsKey(s.substring(0, i))) {
                    return false;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        P_42577 p = new P_42577();
        String[] phoneBook = {"119", "97674223", "1195524421"};
        System.out.println(p.solution(phoneBook));
        System.out.println(p.solution2(phoneBook));
    }
}
