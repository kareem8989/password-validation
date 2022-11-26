package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scr = new Scanner(System.in);
       String str;
        while (!(str = scr.nextLine()).equals("x")){

            System.out.println(checkLengthAndContainsNum(str));

        }
        System.out.println("goodbye");
    }



    public static String checkLengthAndContainsNum(String str){
        String tbr = "successful";
        boolean len = str.length() < 8;
        if(len){
            tbr = "You have to give longer password then: " + str.length() + "\n";
        }
        if(!containsNum(str)){
            if(len){
                tbr = tbr + "Your password must contains numbers.";
            }else {
                tbr = "Your password must contains numbers.";
            }
        }
        return tbr;
    }


    public static boolean containsNum(String str){
        boolean tbr = false;
        char[] x = str.toCharArray();
        for (char c : x) {
            if (Character.isDigit(c)) {
                tbr = true;
            }
        }
        return tbr;
    }
}