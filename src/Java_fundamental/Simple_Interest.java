package Java_fundamental;
import java.util.Scanner;
public class Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER Principal:");
        int n1 = sc.nextInt();
        System.out.print("ENTER Rate:");
        int n2 = sc.nextInt();
        System.out.print("ENTER Time:");
        float n3 = sc.nextFloat();
        System.out.printf("Simple Interest: %.2f",(n1*n2*n3/100));
    }
}
