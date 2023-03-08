package codingTest;

import java.util.*;

public class P_1 {


    /*
    * 1.선호하는 기업에 넣는다.
    * 2. 기업에서 색출한다.
    * 3. 거절당한 인원이 다음 순위에 넣는다.*/

    static ArrayList<String> failApplicant;

    public String[] solution(String[] companies, String[] applicants) {
        String[] answer = new String[companies.length];
        Map<String, ArrayList> com = new HashMap<>();
        Map<String, Queue<String>> app = new HashMap<>();
        String[] appName = new String[applicants.length];
        String[] companyName = new String[companies.length];

        for (int i = 0; i <companies.length ; i++) {
           String[] company = companies[i].split(" ");
           ArrayList arrayList = new ArrayList<>();
           arrayList.add(company[1]); // 선호도
           arrayList.add(new String[Integer.parseInt(company[2])]); // 고용인원
           com.put(company[0],arrayList);

            companyName[i] = company[0];
        }

        for (int i = 0; i <applicants.length ; i++) {
            String[] applicant = applicants[i].split(" ");
            Queue queue = new LinkedList();
            for (int j = 0; j <Integer.parseInt(applicant[2]) ; j++) {
                queue.offer(applicant[1].charAt(j));
            }
            app.put(applicant[0],queue);
            appName[i] = applicant[0];
        }
        findReject(appName,com,app);

        // 거절 된애들로 다시 반복

        while (!failApplicant.isEmpty()){
            for (int i = 0; i <failApplicant.size() ; i++) {
                if(!app.get(failApplicant.get(i)).isEmpty()){
                    String applicantCompanyName = String.valueOf(app.get(failApplicant.get(i)).poll());

                    if(com.containsKey(applicantCompanyName)){
                        ArrayList company = com.get(applicantCompanyName);
                        String refer = (String)company.get(0);

                        // 값을 가지고 있어야해
                        String[] passApplicant = (String[]) company.get(1);

                        int score = refer.indexOf(failApplicant.get(i));

                        // 선호도 확인
                        for (int j = 1; j <passApplicant.length ; j++) {
                            if(passApplicant[j-1] == null || refer.indexOf(passApplicant[j-1]) > score){
                                String tmp = passApplicant[j];
                                String fail = passApplicant[j-1];
                                passApplicant[j] = failApplicant.get(i);
                                failApplicant.remove(i);
                                passApplicant[j-1] = tmp;

                                if(fail != null) failApplicant.add(fail);
                                break;
                            }
                        }
                        company.set(1,passApplicant);
                        com.put(applicantCompanyName,company);
                    }
                }
                else failApplicant.remove(i);

            }
        }

        // 답 뽑아내기
        // null제외 시켜야해
        for (int i = 0; i <companyName.length ; i++) {
            String[] strArr = (String[]) com.get(companyName[i]).get(1);
            String str = "";

            for (int j = 0; j <strArr.length ; j++) {
                if(strArr[j] != null){
                    str += strArr[j];
                }
            }

            char[] chars =str.toCharArray();
            Arrays.sort(chars);
            str = new String(chars);

            answer[i] = companyName[i]+"_"+str;
        }


        return answer;
    }

    public void findReject(String[] name,Map<String, ArrayList> com,Map<String, Queue<String>> app){
        failApplicant = new ArrayList<>();

        for (int i = 0; i<name.length ; i++) {
            if(!app.get(name[i]).isEmpty()){
                String applicantCompanyName = String.valueOf(app.get(name[i]).poll());
                if(com.containsKey(applicantCompanyName)){
                    ArrayList company = com.get(applicantCompanyName);
                    String refer = (String)company.get(0);

                    // 값을 가지고 있어야해
                    String[] passApplicant = (String[]) company.get(1);

                    int score = refer.indexOf(name[i]);
                    // 선호도 확인

                    for (int j = 1; j <passApplicant.length ; j++) {
                        if(passApplicant[j-1] == null || refer.indexOf(passApplicant[j-1]) > score){
                            String tmp = passApplicant[j];
                            String fail = passApplicant[j-1];
                            passApplicant[j] = name[i];
                            passApplicant[j-1] = tmp;

                            if(fail != null) failApplicant.add(fail);
                            break;
                        }
                    }
                    company.set(1,passApplicant);
                    com.put(applicantCompanyName,company);
                }
            }

        }
    }
/**/
    public static void main(String[] args) {
        String[] companies = {"A fabdec 2", "B cebdfa 2", "C evfadb 2"};
        String[] applicants = {"a BAC 1", "b BAC 3", "c BCA 2", "d ABC 3", "e BCA 3", "f ABC 2"};

        P_1 p = new P_1();
        p.solution(companies,applicants);
    }

}
