package org.freedev;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.addition(12,13);
        boolean test = calculator.isEvent(12);
        System.out.println(test);
        System.out.println(result);
    }
}
