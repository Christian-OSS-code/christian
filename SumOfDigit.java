import java.util.Scanner;
 public class SumOfDigit{
  public static void main(String[] args){
   Scanner insert = new Scanner(System.in);
   System.out.print("Enter integer: ");
   int number1 = insert.nextInt();
   
   int digit1 = (number1)/100;
   int digit2 = (((number1)/10)%10);
   int digit3 = (number1)%10;
    
   int sum = digit1 + digit2 + digit3;
   System.out.printf("sum is %d", sum);
  }
 }


PSEUDOCODE
Stage1
- prompt the user to collect an integer between 0 and 1000
- display the sum of the digits that makes up the integer collected
Stage2
- prompt the user to enter an integer between 0 and 1000
- collect the integer
- store the integer as number1
- calcualte using;
(number1)/100
- store the result as "digit1"
(number1)/10
- store the result as "number"
- number%10
- store the result as "digit2"
 (number1)%10
- store the result as "digit3"
calculate sum using
digit1 + digit2 + digit3
- store the result as "sum"
- Display "sum"


   