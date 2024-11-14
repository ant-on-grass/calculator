package Procedural;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 필드
        int result;
        int[] gather = new int[4];
        Map<Integer,String> caL_sign_m = new HashMap<Integer,String>();
        String cal_str;
        Queue<int[]> log = new LinkedList<int[]>();

        //

        Scanner scanner = new Scanner(System.in);
        caL_sign_m.put(1,"+");
        caL_sign_m.put(2,"-");
        caL_sign_m.put(3,"*");
        caL_sign_m.put(4,"/");

        System.out.println("계산기 입니다! 맨트에 따라 입력을 해주신다면, 해당 결과를 출력해드립니다.");
        System.out.println("어떤 연산을 필요로 하시나요?");
        System.out.println("덧셈 : 1 , 뺄셈 : 2 , 곱셉 : 3 , 나눗셈 : 4");
        int calculation_int = scanner.nextInt();
        gather[0] = calculation_int;
        cal_str = caL_sign_m.get(calculation_int);

        System.out.print("연산에 필요한 첫번째 수를 입력해주세요~ : ");
        int num1 = scanner.nextInt();
        gather[1] = num1;

        System.out.print("연산에 필요한 두번째 수를 입력해주세요~ : ");
        int num2 = scanner.nextInt();
        gather[2] = num2;

        switch (calculation_int) {
            case 1 -> {
                result = num1 + num2;
                gather[3] = result;
            }
            case 2 -> {
                result = num1 - num2;
                gather[3] = result;
            }
            case 3 -> {
                result = num1 * num2;
                gather[3] = result;
            }
            case 4 -> {
                result = num1 / num2;
                gather[3] = result;
            }
        }

        System.out.println();
        System.out.println(num1+cal_str+num2+" = "+ gather[3]+" 입니다.");

        log.add(gather);

        // queue - test
        //System.out.println(Arrays.toString(log.peek()));
    }
}
