package org.example;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        char op;
        int result=0;

        System.out.print("두 수를 계산합니다.\n첫 번 째 수 입력: ");
        num1 = sc.nextInt();
        System.out.print("두 번 째 수 입력 : ");
        num2 = sc.nextInt();
        sc.nextLine();
        System.out.print("연산자 입력 : ");
        op = sc.next().charAt(0);

        switch (op) {
            case '+':
                result= calc.sumTwoNumber(num1, num2);
                break;
            case '-':
                result= calc.minusTwoNumber(num1, num2);
                break;
            case '*':
                result = calc.multiTwoNumber(num1, num2);
                break;
            case '/':
                result = calc.divideTwoNumber(num1, num2);
        }
        System.out.println("result = " + result);
    }


}
