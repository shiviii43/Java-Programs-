package Learn;

import java.util.Scanner;

public class Calc {
    
  public static void main(String[] args){
      //CALCULATOR Basics

      @SuppressWarnings("resource")
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number :");
      int num1 = sc.nextInt();
      System.out.println("Enter second number :");
      int num2 = sc.nextInt();
      System.out.println("Enter the Operation you want to perform :");
      char op = sc.next().charAt(0);
      if(op =='+')
      {
            System.out.println("The SUM is "+(num1+num2));
      }
      else if(op =='-')
      {
            System.out.println("The SUB is "+(num1-num2));
      }
      else if(op == '*')
      {
        System.out.println("The MUL is "+(num1*num2));
      }
      else if(op=='/')
      {
        System.out.println("The DIV is "+(num1/num2));
      }
      else if(op == '%')
      {
        System.out.println("The MOD div is "+(num1%num2));
      }
      else
      {
        System.out.println("The Entered Operator is Invalid.");
      }
  }

}
