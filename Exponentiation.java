import java.util.Scanner;
 public class Exponentiation{
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   int powerResult = 1;
   System.out.print("Enter the base number: ");
   int baseNumber = input.nextInt();
   System.out.print("Enter the exponent number: ");
   int exponentNumber = input.nextInt();
   for (int i = 0; i < exponentNumber; i ++){
    powerResult *= baseNumber;
   }
    System.out.print("The result of " + baseNumber + " raised to the power of " + exponentNumber + " is " + powerResult);
  }
 }
   
   