package Java_fundamental;
import java.util.Scanner;
public class Perimeter_of_a_Rectangle {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER Length:");
        int n1 = sc.nextInt();
        System.out.print("ENTER Width:");
        int n2 = sc.nextInt();
        System.out.printf("Perimeter of the Rectangle: %d",2*(n1+n2));
    }
}