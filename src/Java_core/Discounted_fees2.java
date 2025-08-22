package Java_core;
import java.util.Scanner;
public class Discounted_fees2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Fee:");
        int fee=sc.nextInt();
        System.out.print("Discount Precent:");
        int discountPrecent=sc.nextInt();

        System.out.printf("The discount amount is INR %d and final discounted fee is INR %d",(discountPrecent*fee)/100,fee-(discountPrecent*fee)/100);
    }
}
