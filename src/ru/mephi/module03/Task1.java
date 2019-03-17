package ru.mephi.module03;

import java.math.BigInteger;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        inOut();

    }

    private static void inOut(){
        Scanner scan = new Scanner(System.in);
        String input[];

        System.out.print("Input array of numbers please:\n");
        input = scan.nextLine().split(",");
        if (checkType(input)){
            String line = sortOfArray(input);
            System.out.print("Sort array:\n");
            System.out.print(line);
        }else{
            inOut();
        }

    }

    private  static String sortOfArray(String[] input){
        String[] output = new String[input.length];
        int j = 0;
        for (int i = 0; i < input.length; i++){
            if(Integer.valueOf(input[i].replace(" ", "")) < 0){
                output[j] = input[i].replace(" ", "");
                input[i] = null;
                j++;
            }
        }
        for (String num: input){
            if (num != null){
                output[j] = num.replace(" ", "");
                j++;
            }
        }

        String line = "[";
        for (String num: output){
            line += num + ", ";
        }
        line += "]";

        return line;
    }

    private static boolean checkType(String[] arg){
        try {
            for(String i: arg){
                i = i.replace(" ", "");
                Integer.valueOf(i);
            }
        }catch (NumberFormatException ex){
            return false;
        }
        return true;
    }
}

