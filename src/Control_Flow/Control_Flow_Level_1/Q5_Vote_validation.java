package Control_Flow_Level_1;
import java.util.Scanner;
public class Q5_Vote_validation {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter age:");
        int n1=sc.nextInt();
        if (n1>=18){
            System.out.printf("The person's age %d, and can vote.",n1);
        }
        else
            System.out.printf("The person's age is %d, and  can't vote.",n1);
    }
}
