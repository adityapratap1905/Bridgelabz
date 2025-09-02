package Control_Flow_Level_1;
import java.util.Scanner;
public class Q8_Rocket_launch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n1 = sc.nextInt();
        while (n1>=1){
            System.out.printf("%d\n",n1);
           n1= n1-1;
        }
    }
}
