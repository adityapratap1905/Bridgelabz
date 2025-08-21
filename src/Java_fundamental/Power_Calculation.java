package Java_fundamental;
import java.lang.Math;
import java.util.Scanner;

public class Power_Calculation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int  n1= sc.nextInt();
        System.out.print("Power:");
        int n2= sc.nextInt();
        System.out.print("Answer: "+Math.pow(n1,n2));

    }

}
