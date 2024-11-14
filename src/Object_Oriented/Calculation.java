package Object_Oriented;

import java.util.HashMap;
import java.util.Map;

public class Calculation {

    // 필드
    private Map<Integer, String> caL_sign_m = new HashMap<Integer, String>();
    private String cal_str;
    private String reult_print;


    // 기본 생성자
    Calculation() {
        reult_print = "x";
        caL_sign_m.put(1, "+");
        caL_sign_m.put(2, "-");
        caL_sign_m.put(3, "*");
        caL_sign_m.put(4, "/");
        // 해당 값은 필드의 초기 값 이라 생성자에 실행문에서 입력 가능
    }

    int cal(int num1, int num2 , int sign) {
        int result;

        this.cal_str = caL_sign_m.get(sign);

        result = switch (sign) {
            case 1 -> num1 + num2;
            case 2 -> num1 - num2;
            case 3 -> num1 * num2;
            case 4 -> num1 / num2;
            default -> 0;

        };
        this.reult_print = num1+ this.cal_str +num2+" = "+ result +" 입니다." ;
        return result;
    }

    String req_res (){
        return this.reult_print;
    }// priavte


}
