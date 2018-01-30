/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;
import java.util.Scanner;

/**
 *
 * @author teerapat
 */
public class Program1 {
    
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Count");
        String Input1 = Sc.next();
        String Input2 = Sc.next();

        if(Input1.equals("vowel")) {
              System.out.println(countVowels(Input2));
        }else if(Input1.equals("alphabet")) {
              System.out.println(countAlphabets(Input2));
        }else if(Input1.equals("digit")) {
              System.out.println(countDigits(Input2));
        }else if(Input1.equals("lowercase")) {
              System.out.println(countLowercases(Input2));
        }else if(Input1.equals("uppercase")) {
              System.out.println(countUppercases(Input2));
        }
        else {
                System.out.println("SomeThing is wrong");
        }
        
       }
    
    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            
            switch (str.charAt(i)) {
                case 'a':count++;break;
                case 'e':count++;break;
                case 'i':count++;break;
                case 'o':count++;break;
                case 'u':count++;break;
                default:
            }
        }
        
        return count;
    }
    
    
    public static int countDigits(String str) {
        int count = 0;
    
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }
    
    public static int countAlphabets(String str) {
        
        return str.length() - countVowels(str);
    }
    
    public static int countLowercases(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLowerCase(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }
    
    public static int countUppercases(String str) {
        return str.length() - countLowercases(str);
    }
    
}
