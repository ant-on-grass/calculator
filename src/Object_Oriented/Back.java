/*
package Object_Oriented;

import java.util.HashMap;
import java.util.Map;

public class Back {
    // 필드
    Map<Integer, String> caL_sign_m = new HashMap<Integer, String>();

    Back() {
        caL_sign_m.put(1, "+");
        caL_sign_m.put(2, "-");
        caL_sign_m.put(3, "*");
        caL_sign_m.put(4, "/");
        // 해당 값은 필드의 초기 값 이라 생성자에 실행문에서 입력 가능
    }

    // 생각 2.
    // 초반에 공통된 멘트를 가지고 해당 문제를 풀라했으나...
    // 잘못된 생각
    // 만드려는 메서드 early_remarks() 과 back() 에 무한 루프...
    void early_remarks(){
        System.out.println("계산기 입니다! 맨트에 따라 입력을 해주신다면, 해당 결과를 출력해드립니다.");
        System.out.println("어떤 연산을 필요로 하시나요?");
    }

    // 생각 1.
    // Main 에 코드를 더럽히기 싫어서 초반 도입부 멘트를 하나의 메서드로 만들라 했다.
    // 주어진 연산기호 ( - 번호)가 없으면, 다시 반복문으로 돌아가게끔

    // continue를 생각함,
    // 하지만 해당 메서드에서 반복문이 없어서, continue 가 안먹힘
    void back(int check_point){
        switch (check_point){
            case 1 -> System.out.println("덧셋 연산을 시작합니다.");
            case 2 -> System.out.println("뺄셋 연산을 시작합니다.");
            case 3 -> System.out.println("곱셋 연산을 시작합니다.");
            case 4 -> System.out.println("나눗셋 연산을 시작합니다.");
            default -> {
                System.out.println("잘못된 입력 값입니다. ");
                continue; return;
            }
        }
    }
    // 결론 어쩔수없이 main에 쓰도록 한다.

}
*/
