import java.util.Scanner;
 public class UserName{
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter Username: ");
   String userName = input.nextLine();
   System.out.print("Hi userName, Nice to meet you");
   System.out.println("\nHi userName, Nice to meet you");
   System.out.printf("Hi %s, Nice to meet you", userName);
 }
}
 PseudoCode
Prompt the user to collect username
display in the form; Hi Username, Nice to meet you
 Stage2
Prompt to enter username 
collect the username
store the username as "Username"
display as "Hi Username, Nice to meet you"