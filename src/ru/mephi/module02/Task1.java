package ru.mephi.module02;

import java.util.Scanner;


public class Task1 {
    public static void main(String[] args){
        inOut();
    }

    private static void inOut(){
        Scanner scan = new Scanner(System.in);
        String input;

        System.out.print("Input radius please:\n");
        input = scan.next();
        if (checkType(input)){
            double radius = Double.valueOf(input);
            squarePerimeter(radius);
        }else{
            inOut();
        }

    }

    private static boolean checkType(String arg){
        try {
            Double.valueOf(arg);
        }catch (NumberFormatException ex){
            return false;
        }
        return true;
    }

    private static void squarePerimeter(double r){
        double square = 2 * Math.PI * r;
        System.out.printf("\nSquare = %f",square);
        double perimeter = 2 * Math.PI * r*r;
        System.out.printf("\nPerimeter= %f",perimeter);
    }
}
