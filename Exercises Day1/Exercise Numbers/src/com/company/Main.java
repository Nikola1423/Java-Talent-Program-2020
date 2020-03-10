package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	String word=new Scanner(System.in).nextLine();
	String[] splitWord=word.split(" ");
	String numbersSting="";
        for(int i=0;i<splitWord.length;i++){
            switch (splitWord[i]){
                case "zero":
                    numbersSting+="0";
                    break;
                case "one":
                    numbersSting+="1";
                    break;
                case "two":
                    numbersSting+="2";
                    break;
                case "three":
                    numbersSting+="3";
                    break;
                case "four":
                    numbersSting+="4";
                    break;
                case "five":
                    numbersSting+="5";
                    break;
                case "six":
                    numbersSting+="6";
                    break;
                case "seven":
                    numbersSting+="7";
                    break;
                case "eight":
                    numbersSting+="8";
                    break;
                case "nine":
                    numbersSting+="9";
                    break;
            }

        }
        int result=Integer.parseInt(numbersSting);
        System.out.println(result);
    }
}
