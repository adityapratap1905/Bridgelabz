package Java_fundamental;
import java.util.Scanner;
public class Kilometers_to_Miles {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTER K.M:");
        int n1= sc.nextInt();
        System.out.printf("Distance in Miles: %f",n1*0.621371);
    }
}
