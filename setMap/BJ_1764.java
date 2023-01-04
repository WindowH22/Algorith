package setMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int hearPeople = Integer.parseInt(st.nextToken());
        int seePeople = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i <hearPeople ; i++) {
            set.add(bf.readLine());
        }

        for (int i = 0; i <seePeople ; i++) {
            String people = bf.readLine();
            if(set.contains(people)){
                arrayList.add(people);
            }
        }

        arrayList.sort(Comparator.naturalOrder());
        System.out.println(arrayList.size());
        for(String s : arrayList){
            System.out.println(s);
        }
    }
}
