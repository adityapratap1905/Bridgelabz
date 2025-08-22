package Java_core;
import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("distanceInFeet:");
        float n1=sc.nextFloat();
        System.out.printf("Your Height in feet is %.2f while in yards is %.2f and miles is %.2f",n1,n1 / 3.0, n1/ (1760.0*3.0));
    }
}
