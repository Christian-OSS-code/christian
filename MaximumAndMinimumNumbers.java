import java.util.Scanner;
 public class MaximumAndMinimumNumbers{
  public static void main(String[] args){

   Scanner reader = new Scanner(System.in);
    System.out.print("Enter a number the lies between 1 and 30: ");
    double firstNumber = reader.nextDouble();

      double maxNumber = firstNumber;
      double minNumber = firstNumber;

     while (firstNumber != -1){

	    System.out.print("Enter a number between 1 and 30: ");
    	firstNumber = reader.nextDouble();

      if (firstNumber > maxNumber && firstNumber != -1){
       maxNumber = firstNumber;
       
      }
      if (firstNumber < minNumber && firstNumber != -1){
       minNumber = firstNumber;
      }
     }
	System.out.printf("The minimum number is %.2f%n", minNumber);
	System.out.printf("The maximum number is %.2f", maxNumber);
    
     
  }
 } 

 