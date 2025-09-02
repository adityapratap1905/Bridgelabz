package Control_Flow_Level_1;
import java.util.Scanner;
public class Q4_natural_number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a Natural Number:");
        int n1=sc.nextInt();
        if (n1>0){
            System.out.printf("%d is a natural number\n",n1);
            int s=0;
            for (int i=1;i<=n1;i++){
             s=s+i;
            }
            System.out.printf("Sum of first %d natural numbers:%d",n1,s);
        }
        else {
            System.out.printf("%d is not a natural number\n",n1);
        }
    }
}
