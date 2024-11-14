package Procedural;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int result;
        int[] gather = new int[4];
        //Queue
        Scanner scanner = new Scanner(System.in);

        System.out.println("계산기 입니다! 맨트에 따라 입력을 해주신다면, 해당 결과를 출력해드립니다.");
        System.out.println("어떤 연산을 필요로 하시나요?");
        System.out.println("덧셈 : 1 , 뺄셈 : 2 , 곱셉 : 3 , 나눗셈 : 4");
        int calculation = scanner.nextInt();

        System.out.print("연산에 필요한 첫번째 수를 입력해주세요~ : ");
        int num1 = scanner.nextInt();

        System.out.print("연산에 필요한 첫번째 수를 입력해주세요~ : ");
        int num2 = scanner.nextInt();

        if(calculation == 1){
            result = num1+num2;

        }
    }
}
