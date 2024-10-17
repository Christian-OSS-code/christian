import java.util.Scanner;
 public class Calculator{
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter the weight in kilogram: ");
   double weight = input.nextDouble();
   System.out.print("Enter the height in meters: ");
   double height = input.nextDouble();
   double calculator = (weight)/(height*height);
   
   if (calculator < 18.5){
    System.out.println("patient is underweight");
   }
   if (18.5 <= calculator && calculator <= 24.9){
    System.out.println("patient is of normal weight");
   }
   if (25 <= calculator && calculator <= 29.9){
    System.out.println("patient is overweight");
   }
  }
 }
  
 