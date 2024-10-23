import java.util.Scanner;
 public class AdjacentAsterisks{
  public static void main(String[] args){
   Scanner input = new Scanner(System.in); 
   int[] numberArray = new int[5];
   int numberCounter = 0;
   int asterisksCounter = 0;
   while (numberCounter < 5){
    System.out.print("Enter a number between 1 and 30: ");
    int usersNumber = input.nextInt();  
    if (usersNumber > 1 && usersNumber < 30){ 
     numberArray[numberCounter] = usersNumber;
     numberCounter++;
    }
    else {
     System.out.println("You have entered and invalid number. Please, enter a number between 1 and 30");
    }
   } 
     while (asterisksCounter < 5){
      int asterisks = numberArray[asterisksCounter];
      int outPutAsterisksCounter = 0;
      while (outPutAsterisksCounter < asterisks){ 
       System.out.print("*");
        outPutAsterisksCounter++;
      }
       System.out.println();
        asterisksCounter++;
     }
  }
 }