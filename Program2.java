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
public class Program2 {
        public static void main(String[] args) {
            Scanner Sc = new Scanner(System.in);
            
            
            System.out.print("formatter ");
            String Input1 = Sc.next();
            String Input2 = Sc.next();
            boolean isInteger = isInteger(Input1);
            char[] text = Input1.toCharArray();
            char[] chars = Input2.toCharArray();
           
            String output = "";
            int lenFormat = Input2.length();
            int lenText = Input1.length();
            int countPosText = 0;
            if(isInteger) {
                if( lenText < lenFormat) {
                    for (int i = 0; i < lenFormat; i++) {
                        if (countPosText < lenText) {
                            if(chars[i] == '-') {
                                output+='-';
                                output += text[countPosText];
//                                System.out.println(output+ "::I" + countPosText);
                                countPosText++;
                                i++;
                            } else {
                                output += text[countPosText];
//                                System.out.println(output+ "::E" + countPosText);

                                countPosText++;
                            }
                        }
                    }
                }else {
                    System.out.println("SomeThing is wrong");
                }
            }
            else {
                System.out.println("Not Integer");
            }
                
                
           
           
            System.out.println(output);
            
    }
        
        public static boolean isInteger(String str) {
            boolean isInteger = true;
            for (int i = 0; i < str.length(); i++) {
                if(Character.isDigit(str.charAt(i)) != true) {
                    return false;
                }
            }
            return true;
        }
}
