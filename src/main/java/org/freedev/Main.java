package org.freedev;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("hello world");
        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.addition(12,13);
        boolean test = calculator.isEvent(12);
        System.out.println(test);
        System.out.println(result);
        System.out.println("saisissez votre userName");
        String username = clavier.nextLine();
        System.out.println("saisissez votre password");
        String passWord = clavier.nextLine();
        System.out.println("confirmer votre mot de passe");
        String confirmePassword = clavier.nextLine();
        RegistrationUtil registrationUtil = new RegistrationUtil();
        boolean testeUser = registrationUtil.validateUserInput(username,passWord,confirmePassword);
        System.out.println(testeUser);
    }
}
