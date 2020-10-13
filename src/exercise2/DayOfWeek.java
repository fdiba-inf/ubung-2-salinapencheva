package exercise2;

import java.util.Scanner;

public class DayOfWeek{
      
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

  int a = input.nextInt();
  if(a==1){
    System.out.println("Day of week: Monday");
  }else if(a==2){
    System.out.println ("Day of week: Tuesday");
  }else if(a==3){
    System.out.println ("Day of week: Wednesday");
  }else if(a==4){
    System.out.println ("Day of week: Thursday");
  }else if(a==5){
    System.out.println ("Day of week: Friday");
  }else if(a==6){
    System.out.println ("Day of week: Saturday");
  }else if(a==7){
    System.out.println ("Day of week: Sunday");
  }else{
    System.out.println ("Invalid day");
  }     
}
}