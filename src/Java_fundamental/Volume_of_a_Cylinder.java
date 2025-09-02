package Java_fundamental;
import java.util.Scanner;
public class Volume_of_a_Cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER Radius:");
        float n1 = sc.nextFloat();
        System.out.print("ENTER Height:");
        float n2 = sc.nextFloat();
        System.out.printf("Volume of a Cylinder: %.2f",(22/7)*n1*n1*n2);

    }
}
