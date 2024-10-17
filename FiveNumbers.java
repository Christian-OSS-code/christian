//FiveNumbers.java
//program that counts negative, zero and positive numbers
import java.util.Scanner;
 public class FiveNumbers{
//the main method marks the point where the execution of the program begins
  public static void main(String[] args){
//creating the Scanner object
   Scanner insert = new Scanner(System.in);
//promting the user to input numbers
   System.out.print("Enter first number: "); 
   double num1 = insert.nextDouble();
   System.out.print("Enter second number: ");
   double num2 = insert.nextDouble();
   System.out.print("Enter third number: ");
   double num3 = insert.nextDouble();
   System.out.print("Enter fourth number: ");
   double num4 = insert.nextDouble();
   System.out.print("Enter fifth number: ");
   double num5 = insert.nextDouble();
 //initializing all counts to zero
   int countNegative = 0;
   int countPositive = 0;
   int countZero = 0;
   if(num1 < 0){
    countNegative = countNegative + 1; 
   }
   if(num1 > 0){
    countPositive = countPositive + 1;
   }
   if(num1 == 0){
    countZero = countZero + 1;
   }
   if(num2 < 0){
    countNegative = countNegative + 1;
   }
   if(num2 == 0){
    countZero = countZero + 1;
   }
   if(num2 > 0){
    countPositive = countPositive + 1;
   }
   if(num3 < 0){
    countNegative = countNegative + 1;
   }
   if(num3 == 0){
    countZero = countZero + 1;
   }
   if(num3 > 0){
    countPositive = countPositive + 1;
   }
   if(num4 < 0){
    countNegative = countNegative + 1;
   }
   if(num4 == 0){
    countZero = countZero + 1;
   }
   if(num4 > 0){
    countPositive = countPositive + 1;
   }
   if(num5 < 0){
    countNegative = countNegative + 1;
   }
   if(num5 == 0){
    countZero = countZero + 1;
   }
   if(num5 > 0){
    countPositive = countPositive + 1;
   }
    System.out.printf("Total Negative Count is %d", + countNegative++);
    System.out.println("\nTotal Zero Count is " +  countZero++);
    System.out.print("Total Positive Count is " +  countPositive++);
  }
 }
