import java.util.Scanner;

public class Converter{
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Input current  conversion rate: ");
            double conversionRate = sc.nextDouble();
            System.out.println("Input rubles: ");
            double rubles = sc.nextDouble();

            double dollars=rubles/conversionRate;

            System.out.format("%.2f $",dollars);
        }
}