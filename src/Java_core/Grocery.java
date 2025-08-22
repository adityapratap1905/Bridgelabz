package Java_core;
import java.util.Scanner;
public class Grocery {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Unit Price:");
        float n1=sc.nextFloat();
        System.out.print("Quantity:");
        int n2=sc.nextInt();
        System.out.printf("The total purchase price is INR %.2f if the quantity %d and unit price is INR %.2f",n1*n2,n2,n1);
    }
}
