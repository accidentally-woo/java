package timeattack;

import java.util.Objects;

public class Login {
    /*
    - 아이디, 비밀번호 모두 일치하는 회원정보가 있으면 "login" 반환
    - 아이디 일치, 비밀번호 일치X "wrong pw"를 리턴
    - 로그인이 실패했을 때 아이디가 일치하는 회원이 없다면 "fail"
     */
    private final String LOGIN_SUCCESS = "login";
    private final String WRONG_PASSWORD = "wrong pw";
    private final String LOGIN_FAILED = "fail";

    String login(String[] id_pw, String[][] db) {
        for (String[] record : db) {
            if (Objects.equals(record[0], id_pw[0])) {
                if (Objects.equals(record[1], id_pw[1])) {
                    return LOGIN_SUCCESS;
                } else {
                    return WRONG_PASSWORD;
                }
            }
        }
        return LOGIN_FAILED;
    }
}

class Main4 {
    public static void main(String[] args) {
        Login login = new Login();
        System.out.println(
                login.login(
                        new String[]{"meosseugi", "1234"},
                        new String[][]{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}}
                )
        );

        System.out.println(
                login.login(
                        new String[]{"programmer01", "15789"},
                        new String[][]{{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}}
                )
        );

        System.out.println(
                login.login(
                        new String[]{"rabbit04", "98761"},
                        new String[][]{{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}}
                )
        );

    }
}