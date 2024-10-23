import java.util.Scanner;
 public class SumOfTwoNumbers{
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   String decision;
   System.out.print("Enter the first number: ");
   double firstNumber = input.nextDouble();
   System.out.print("Enter the second number: ");
   double secondNumber = input.nextDouble();
   double sum = firstNumber + secondNumber;
   System.out.print("Do you want to perform the operation again (Y or N): " );
   decision = input.nextLine();
	input.nextLine();
   while (decision.equalsIgnoreCase("Y") || !decision.equalsIgnoreCase("N")){

	System.out.print("Enter the first number: ");
   	 firstNumber = input.nextDouble();
   	System.out.print("Enter the second number: ");
    secondNumber = input.nextDouble();
    sum = firstNumber + secondNumber;
   System.out.print("Do you want to perform the operation again (Y or N): " );
	input.nextLine();

    }System.out.print("Program has been terminated. Thank you");
input.close();
  }
 }
   
   
