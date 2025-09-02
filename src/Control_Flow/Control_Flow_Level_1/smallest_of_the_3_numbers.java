package Control_Flow_Level_1;
import java.util.Scanner;
public class smallest_of_the_3_numbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        float n1=sc.nextFloat();
        float n2=sc.nextFloat();
        float n3=sc.nextFloat();
        if (n1 < n2 && n3>n1){
            System.out.printf("Is the first number the smallest? Yes");
        }
        else {
            System.out.println("Is the first number the smallest? No");
        }
    }
}
