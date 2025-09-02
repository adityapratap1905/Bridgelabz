package Control_Flow_Level_1;
import java.util.Scanner;

public class largest_of_the_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        float n1=sc.nextFloat();
        float n2=sc.nextFloat();
        float n3=sc.nextFloat();
        if (n1>n2 && n1 >n3){
            System.out.println("Is the first number the largest? Yes");
        }
        else if (n2>n1 && n2 >n3){
            System.out.println("Is the second number the largest? Yes");
        }
        else if (n3>n2 && n1 < n3){
            System.out.println("Is the third number the largest? Yes");
        }


    }
}
