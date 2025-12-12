package org.example;

import java.util.Scanner;

public class UserInput {
    private static Scanner sc;

    private UserInput(){

    }

    public static void takeStringAsInput(){
        sc = new Scanner(System.in);
        System.out.println("Enter your full Name");
        String name = sc.nextLine();
        System.out.println("Enter your age");
        Integer age = sc.nextInt();
        System.out.println("Are you married?");
        Boolean bool = sc.nextBoolean();
        close();
    }

    private static void close(){
        sc.close();
    }
}
