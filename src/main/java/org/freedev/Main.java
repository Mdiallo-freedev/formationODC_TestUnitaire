package org.freedev;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.calculateAdd(12,13);
        System.out.println(result);
    }
}
