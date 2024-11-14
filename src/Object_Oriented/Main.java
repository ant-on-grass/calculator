package Object_Oriented;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculation cal = new Calculation();
        Save save = new Save();
        Log log = new Log(save);
        // 고친부분
        System.out.println("계산기 입니다! 맨트에 따라 입력을 해주신다면, 해당 결과를 출력해드립니다.");
        System.out.println("어떤 연산을 필요로 하시나요?");

        while (true) {

            int result;

            System.out.println("덧셈 : 1 , 뺄셈 : 2 , 곱셉 : 3 , 나눗셈 : 4 , 로그 확인하기 : 5");
            int calculation_int = scanner.nextInt();

            switch (calculation_int) {
                case 1 -> System.out.println("덧셋 연산을 시작합니다.");
                case 2 -> System.out.println("뺄셋 연산을 시작합니다.");
                case 3 -> System.out.println("곱셋 연산을 시작합니다.");
                case 4 -> System.out.println("나눗셋 연산을 시작합니다.");
                case 5 -> {
                    System.out.println("로그를 확인합니다. ");
                    log.log_data();
                    continue;
                }
                default -> {
                    System.out.println("잘못된 입력 값입니다. 다시 시작합니다.");
                    continue;
                }
            }

            System.out.print("연산에 필요한 첫번째 수를 입력해주세요~ : ");
            int num1 = scanner.nextInt();


            System.out.print("연산에 필요한 두번째 수를 입력해주세요~ : ");
            int num2 = scanner.nextInt();

            result = cal.cal(num1,num2,calculation_int);

            save.save_log(cal.req_res());
            System.out.println(cal.req_res());

            scanner.nextLine();
            System.out.print("해당 프로그램을 더 종료하시려면 !q 를 입렵하세요");
            String back = scanner.nextLine();
            if(back.equals("q!")){
                break;
            }
        }
    }
}
