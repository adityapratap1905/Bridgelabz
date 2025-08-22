package Java_core;
import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Number1:");
        int n1=sc.nextInt();
        System.out.print("Number2:");
        int n2=sc.nextInt();
        System.out.print("Enter Operator (+, -, *, /): ");
        String op = sc.next();

        switch (op) {
            case "+":
                System.out.printf("%d + %d = %d%n", n1, n2, n1 + n2);
                break;
            case "-":
                System.out.printf("%d - %d = %d%n", n1, n2, n1 - n2);
                break;
            case "*":
                System.out.printf("%d * %d = %d%n", n1, n2, n1 * n2);
                break;
            case "/":
                if (n2 != 0) {
                    System.out.printf("%d / %d = %d%n", n1, n2, n1 / n2);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }

        sc.close();
    }
}


