package exercise2;

import java.util.Scanner;

public class SumOfDigits  {

   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     int a = 888;
     int digit1 = a % 10;
     a = a / 10;
     int digit2 = a % 10;
     a = a / 10;
     int digit3 = a % 10;
     a = a / 10;

     int sum = digit1 + digit2 + digit3;

     System.out.println ("Sum of digits:" + sum );
 
   }
}