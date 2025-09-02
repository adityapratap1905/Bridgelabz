package Control_Flow_Level_1;
import java.util.Scanner;
public class Q9_Rocket_launch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");

        int n1 = sc.nextInt();
        System.out.print("Rocket Launch in...\n");
        for (int i=n1;i>=1;i--){
            System.out.printf("%d\n",i);
        }
    }
}
