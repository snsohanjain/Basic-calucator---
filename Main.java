package com.codewithsohan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        char b = scanner.next().charAt(0);
        int c = scanner.nextInt();
        switch (b){
            case '+' :
                System.out.println(a + c);
                break;
            case '-':
                System.out.println(a - c);
                break;
            case '*':
                System.out.println(a * c);
                break;
            case '/':
                System.out.println(a / c);
                break;
            default : {
                System.out.println("Invalid Enter");
            }

        }




    }
}