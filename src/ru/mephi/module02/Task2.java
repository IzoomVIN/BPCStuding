package ru.mephi.module02;

import java.math.BigInteger;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        inOut();
    }

    private static void inOut(){
        Scanner scan = new Scanner(System.in);
        String input;

        System.out.print("Input number please:\n");
        input = scan.next();
        if (checkType(input)){
            System.out.print("Number in number system of two:\n");
            BigInteger num = new BigInteger(input);
            System.out.print(num.toString(2));
        }else{
            inOut();
        }

    }

    private static boolean checkType(String arg){
        try {
            Integer.valueOf(arg);
        }catch (NumberFormatException ex){
            return false;
        }
        return true;
    }
}
