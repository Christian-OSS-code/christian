import java.util.Scanner;
 public class NaturalNumbers{
  public static void main(String[] args){
   int numberCounter = 1;
   int totalNumber = 0;
   Scanner input = new Scanner(System.in);
   while(numberCounter <= 10){
   System.out.print("Enter a natural number: ");
   int number = input.nextInt();
   numberCounter++;
   totalNumber = totalNumber + number;
   }
   int sumNaturalNumbers = totalNumber;
   System.out.print("The sum of the first " + 10 + " natural numbers is " + totalNumber);
   System.out.println("\nThe sum of the first " + 10 + " natural numbers is " + totalNumber);
   System.out.printf("%s%d%s%d", "The sum of the first ", 10, " natural numbers is ", totalNumber);
  }
 }
   
   