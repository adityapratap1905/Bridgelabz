package Java_core;
import java.util.Scanner;
public class Height_conversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Height in c.m:");
        float h=sc.nextFloat();
        System.out.printf("Your Height in cm is %.2f while in feet is %.2f and inches is %.2f",h,h/30.48,(1/2.54)*h);
    }
}
