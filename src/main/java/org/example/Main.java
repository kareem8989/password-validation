package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//       Scanner src = new Scanner(System.in);
//
//       String  str = src.nextLine();
//        do{
//           System.out.println(checkLengthAndContainsNum(str));
//       }while (str != "x");

    }



    public static String checkLengthAndContainsNum(String str){
        String tbr = "successful";
        if(str.length() < 8){
            tbr = "You have to give bigger longer password then: " + str.length() + "\n";
        }
        if(!containsNum(str)){
            if(str.length() < 8){
                tbr = tbr + "Your password muss contains numbers";
            }else {
                tbr = "Your password must contains numbers";
            }
        }

        return tbr;
    }


    public static boolean containsNum(String str){
        boolean tbr = false;
        char[] x = str.toCharArray();
        for (int i = 0; i < x.length; i++) {

           if(Character.isDigit(x[i])){
               tbr = true;
           }
        }

        return tbr;
    }
}