// Title: PS03_01.java
// Author: Sofiya Kolomiyets
// Date: 10/01/24
// Period: 5a
/*The two roots of a quadratic equation ax2 +bx+c = 0 can be obtained using
the following equation:
x =
−b ±
√
b
2 − 4ac
2a
b
2 − 4ac is called the discriminant of the quadratic equation. If the discriminant is positive, the equation
will have two real roots, if it zero then the equation will have one root. If it is negative, then the equation
will have no real roots.
Write a program that prompts the user to enter values for a, b, and c and displays the result based on
the discriminant. If the discriminant is positive, display the two real roots. If the discriminant is 0, display
only one root. Otherwise, display ”The equation has no real roots.” Here are some sample runs:
Enter a, b, c: 1.0 3 1
The equation has two roots -0.381966 and -2.61803
Enter a, b, c: 1 2.0 1
The equation has one root -1.0
Enter a, b, c: 1 2 3
The equation has no real roots*/

import java.util.Scanner;
public class PS04_02 {
      
   
   public static void main(String[] args) {  
      Scanner scanner = new Scanner(System.in);  
  
      System.out.print("Enter value of a: ");  
      double a = scanner.nextDouble();  
  
      System.out.print("Enter value of b: ");  
      double b = scanner.nextDouble();  
  
      System.out.print("Enter value of c: ");  
      double c = scanner.nextDouble();  
  
      double discriminant = b * b - 4 * a * c;  
  
      if (discriminant > 0) {  
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);  
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);  
        System.out.println("Two real roots: " + root1 + " and " + root2);  
      } else if (discriminant == 0) {  
        double root = -b / (2 * a);  
        System.out.println("One real root: " + root);  
      } else {  
        System.out.println("No real roots");  
      }  
   }  
}

