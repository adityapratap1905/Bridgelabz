package Control_Flow_Level_1;
import java.util.Scanner;
public class Q10_sum_of_numbers_until_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int s=0;
        System.out.println("Enter number:");
        while (true){
             n=sc.nextInt();
             if (n==0){
                 break;
             }
            s=s+n;
            System.out.println("+");
        }
        System.out.println("Sum:"+s);
    }
}
