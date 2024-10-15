import java.util.Scanner;
 public class Multiple{
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter the first integer: ");
   int number1 = input.nextInt();
   
   System.out.print("Enter the second integer: ");
   int number2 = input.nextInt();
   
   int product1 = 3*number1;
   int product2 = 2*number2;
   int multiple = product1%product2;
   
   if(multiple==0){
    System.out.print("product1 is a multiple of product2");
   }
   else if (multiple != 0){
    System.out.print("product1 is not a multiple of product2");
   }
  }
 }

   