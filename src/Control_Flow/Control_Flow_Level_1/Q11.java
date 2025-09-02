package Control_Flow_Level_1;
import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
        int s=0;
        System.out.println("Enter number >0:");
        while(true){
            n=sc.nextInt();
            if (n==0 || n<0){
                System.out.println("You entered a number less than 1");
                break;
            }
            s=s+n;
            System.out.println("+");
        }
        System.out.println("Sum:"+s);
    }
}
