import java.util.Scanner;
 public class MultipleOfANumber{
  public static void main(String[] args){
   Scanner insert = new Scanner(System.in);
   
   System.out.print("Enter first integer: ");
   int integer1 = insert.nextInt();
   
   System.out.print("Enter second integer: ");
   int integer2 = insert.nextInt();
   
   int tripledInteger1 = 3*integer1;
   int doubledInteger2 = 2*integer2;
   
   int factor = (tripledInteger1)%(doubledInteger2);
   if(factor == 0){
    System.out.printf("integer1 which is %d is a multiple of integer2 which is %d", integer1, integer2);
   }
   else if(factor !=0){
    System.out.printf("integer1 which is %d is not a multiple of integer2 which is %d", integer1, integer2);
   }
  }
 } 