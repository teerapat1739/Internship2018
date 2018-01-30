package javaapplication19;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author teerapat
 */
public class Program3 {
	
    
    public static void main(String[] args) {
         Scanner Sc = new Scanner(System.in);
         boolean check = true;
         int prime = Sc.nextInt();
         
         for (int i = 0; i <= prime; i++) {
             check= true;
             for (int j = 2; j < i; j++) {
                 if( i%j == 0) {
                     check = false;
                 }
             }
             if( check == true) {
                     System.out.print(i + " ");
             }
        }

    }
}
