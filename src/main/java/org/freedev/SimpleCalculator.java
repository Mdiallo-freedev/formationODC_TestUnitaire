package org.freedev;

public class SimpleCalculator {

    public int addition(int num1, int num2){
        return num1 + num2;
    }
    public int soustraction(int num1, int num2){
        return num1 - num2;
    }
    public int multiplication(int num1, int num2){
        return num1 * num2;
    }

    public boolean isEvent(int value) {
        if (value % 2 == 0)
            return  true;
        else
            return  false;
    }
}
