// Title: PS03_01.java
// Author: Sofiya Kolomiyets
// Date: 10/01/24
// Period: 5a
/* Write a program that generates two random integers and prompts the user
to enter the sum of these two integers. If the user is correct, print out a message, if they are wrong, print out
a different message and giving them the solution. Sample output is shown below:
What is 39 + 43? 121
Oh No! 39+43 is not equal to 121!
Keep Practicing!
What is 20 + 52? 72
Correct! 20+52 is equal to 72!
Good job!*/
   import java.util.Scanner; 
public class PS04_01 {
 

  public static void main(String[] args) {  
  Scanner scanner = new Scanner(System.in);  
  
  int num1 = (int) (Math.random() * 100) + 1;  
   int num2 = (int) (Math.random() * 100) + 1;  
  
  System.out.print("What is " + num1 + " + " + num2 + "? ");  
   int userSum = scanner.nextInt();  
  
  if (userSum == num1 + num2) {  
System.out.println("Correct! " + num1 + "+" + num2 + " is equal to " + userSum + "!");  
 System.out.println("Good job!");  
   } else {  
System.out.println("Oh No! " + num1 + "+" + num2 + " is not equal to " + userSum + "!");  
System.out.println("The correct answer is " + (num1 + num2) + ".");  
System.out.println("Keep Practicing!");  
 }  
 }  
}

