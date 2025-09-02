package Java_fundamental;
import java.util.Scanner;
public class Celsius_to_Fahrenheit_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER Temperature in Celcius:");
        float n1 = sc.nextFloat();
        System.out.printf("Temperature in Fahrenheit: %.2f",(n1* 9/5) + 32.);
    }
}
