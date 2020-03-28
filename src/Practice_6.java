import java.util.Scanner;

public class Practice_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input x");
        double x = sc.nextDouble();
        System.out.println("Input y");
        double y = sc.nextDouble();
        System.out.println("Input z");
        double z = sc.nextDouble();

        double average=(x+y+z)/2;
        int result=((int)average)/2;


        System.out.println("result="+result);
        if(result>3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
