package ru.mephi.module03;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        inOut();
    }

    private static void inOut() {
        Scanner scan = new Scanner(System.in);
        String lineFirst;
        String lineSecond;

        System.out.print("Input first line please:\n");
        lineFirst = scan.nextLine();
        System.out.print("Input second line please:\n");
        lineSecond = scan.nextLine();

        System.out.print("equals sublines in this lines:\n");
        System.out.print(result(lineFirst, lineSecond));
    }

    private static String result(String line1, String line2) {
        String out = "Count = %d, [%s]";
        String subs = "";
        int count = 0;
        if (line2.length() < line1.length()) {
            String l = line1;
            line1 = line2;
            line2 = l;
        }

        for (int i = 0; i+1 < line1.length(); i++){
            boolean F = true;
            String sub = line1.substring(i, i+2);

            for (String exitsub: subs.split(", ")){
                if (sub.equals(exitsub)){
                    F = false;
                    break;
                }
            }
            if(!F){
                continue;
            }

            for (int j = 0; j+1 < line2.length(); j++){
                if(sub.equals(line2.substring(j,j+2))){
                    count ++;
                    subs += sub + ", ";
                    break;
                }
            }
        }

        out = String.format(out, count, subs);

        return out;
    }
}
