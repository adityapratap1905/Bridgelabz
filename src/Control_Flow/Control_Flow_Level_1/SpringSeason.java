package Control_Flow_Level_1;
import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Day:");
        int day = sc.nextInt();
        if (day >31 || day <1){
            System.out.println("Error");
        }
        else {
            System.out.print("Enter Month:");
            int month = sc.nextInt();
            if ((month == 3 && day >= 20 && day <= 31) ||
                    (month == 4 && day >= 1 && day <= 30) ||
                    (month == 5 && day >= 1 && day <= 31) ||
                    (month == 6 && day >= 1 && day <= 20)) {
                System.out.println("Spring season");
            } else
                System.out.println("Not Spring season");
        }
    }
}