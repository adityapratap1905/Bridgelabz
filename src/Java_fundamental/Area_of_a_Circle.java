package Java_fundamental;
import java.util.Scanner;
public class Area_of_a_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER Radius:");
        float n1 = sc.nextFloat();
        System.out.printf("Area of Circle: %.2f",(22/7)*n1*n1);
    }
}
