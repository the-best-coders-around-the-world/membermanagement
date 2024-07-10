package org.example;

import java.util.Scanner;

public void minusTwoNumber(int a , int b) {
        Scanner sc = new Scanner(System.in);
        System.out.print("계산할 첫번째 수를 입력하세요 : ");
        a = sc.nextInt();
        System.out.println("계산할 두번째 수를 입력하세요 : ");
        b = sc.nextInt();
        int sum = a-b;
        System.out.println(a + " - " + b " = " +sum);
    }
