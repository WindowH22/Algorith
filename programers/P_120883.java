package programers;

public class P_120883 {
    public String solution(String[] id_pw, String[][] db) {
        String id = id_pw[0];
        String pw = id_pw[1];

        for (int i = 0; i <db.length ; i++) {
            if(id.equals(db[i][0])){
                if(pw.equals(db[i][1])){
                    return "login";
                }else{
                    return "wrong pw";
                }
            }
        }
        return "fail";
    }

    public static void main(String[] args) {
        P_120883 p = new P_120883();

        String[] id_pw = {"meosseugi", "1234"};
        String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "124"}};

        System.out.println(p.solution(id_pw,db));
    }


}
