package Java_core;
import java.util.Scanner;
public class Number_of_Handshakes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Number of Students:");
        int n1=sc.nextInt();
        System.out.printf("Number of Handshakes:%d",(n1 * (n1 - 1)) / 2);
    }
}
