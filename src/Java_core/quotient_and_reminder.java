package Java_core;
import java.util.Scanner;
public class quotient_and_reminder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number1:");
        float n1=sc.nextFloat();
        System.out.print("Number2:");
        float n2=sc.nextFloat();
        System.out.printf("The Quotient is %f and Reminder is %.2f of two number %f and %f",n1/n2,n1%n2,n1,n2);
    }
}
