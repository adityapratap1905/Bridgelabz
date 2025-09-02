package Java_fundamental;
import java.util.Scanner;
public class Average_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTER 3 Numbers:");
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int n3= sc.nextInt();
        System.out.printf("Average of %d, %d, %d is: %d",n1,n2,n3,(n1+n2+n3)/3);
    }

}
