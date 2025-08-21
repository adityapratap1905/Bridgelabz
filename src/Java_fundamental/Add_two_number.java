import java.util.Scanner;
public class Add_two_number {

    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     System.out.print("Enter number1:");
     int n1= sc.nextInt();
        System.out.print("Enter number2:");
     int n2 =sc.nextInt();
     System.out.printf("%d + %d = %d",n1,n2,n1+n2);
    }
}
