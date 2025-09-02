package Control_Flow_Level_1;
import java.util.Scanner;
public class divisiblity_by_5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int n1=sc.nextInt();
        if (n1%5==0){
            System.out.printf("Is the number %d divisible by 5? Yes",n1);
        }
        else {
            System.out.printf("Is the number %d divisible by 5? No",n1);
        }

    }
}
