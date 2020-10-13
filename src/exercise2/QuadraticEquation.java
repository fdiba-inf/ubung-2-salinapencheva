package exercise2;

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      System.out.println("Enter a number: ");
      double a = input.nextInt();
      double b = input.nextInt();
      double c = input.nextInt();

      if(a != 0){
       double D = b * b - 4 * a * c;

       if(D>=0){
        double K1 = (-b+Math.sqrt(D))/2*a;
        double K2 = (-b-Math.sqrt(D))/2*a;

        System.out.println(K1 + ", " + K2);
       }else{
        System.out.println("Imaginary values");
       }
      
      }else if(b != 0){
        double x = -c/b;

        System.out.println(x);
      }else if(c != 0){
        System.out.println("No values");
      }else{
        System.out.println("Many values");
      }
    }
}