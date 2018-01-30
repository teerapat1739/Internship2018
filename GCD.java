/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 // this code is my pullrequest
package javaapplication19;

/**
 *
 * @author teerapat
 */

// This code is my pullrequest >> https://github.com/TheAlgorithms/Java/blob/205698d90fd254d8f2ab3c33706dd41dc2288fd8/Others/GCD.java
public class GCD{

      public static int gcd(int num1, int num2) {

        int gcdValue = num1 % num2;
        while (gcdValue != 0) {
            num2 = gcdValue;
            gcdValue = num2 % gcdValue;
        }
        return num2;
    }
	public static int gcd(int[] number) {
		  int result = number[0];
		  for(int i = 1; i < number.length; i++)
			  //call gcd function (input two value)
		          result = gcd(result, number[i]);

		  return result;
	}

	public static void main(String[] args) {
		int[] myIntArray = {4,16,32};
		//call gcd function (input array)
                System.out.println(gcd(myIntArray));
    }
}
