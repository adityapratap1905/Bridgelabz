package Java_core;

public class Volume_of_Earth {
    public static void main(String[] args) {
       double f= (4.0/3.0) * Math.PI * Math.pow(6378, 3);
        System.out.printf("The volume of earth in cubic kilometers is %f and cubic miles is %f",f,f*1.6);
    }
}
