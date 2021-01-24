package com.academy.intro;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Do you have a pet?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        if (name == "no") {
                System.out.println("Im so sorry");}
        else {
                    System.out.println("What kind of pet do you have?");
                    Scanner scanner1 = new Scanner(System.in);
                    String name1 = scanner.nextLine();

                    System.out.println("Your answer is: " + name);
                    System.out.println("You have a " + name1);

                    System.out.println("How old is your " + name1);
                    Scanner scanner2 = new Scanner(System.in);
                    Integer name2 = scanner.nextInt();

                    System.out.println("Your pet is " + name2 + " years old");
                }
    }
}
