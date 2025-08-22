package Java_core;
import java.util.Scanner;
public class Calculator2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Number1:");
        float n1=sc.nextFloat();
        System.out.print("Number2:");
        float n2=sc.nextFloat();
        System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers %f and %f is %.2f, %.2f, %.2f, and %.2f\n",n1,n2,n1+n2,n1-n2,n1*n2,n1/n2);
    }
}
