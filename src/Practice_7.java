import java.util.Scanner;

public class Practice_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number");
        int number=sc.nextInt();
        final int x = 4;
        final int y = 5;
        final int z = 6;

        System.out.println(number);
        switch(number)
        {
            case x:
            System.out.println("Данное значение имеется в константах");
            break;
            case y:
                System.out.println("Данное значение имеется в константах");
                break;
            case z:
                System.out.println("Данное значение имеется в константах");
                break;
            default:
                System.out.println("Такой константы нет!");
                break;
        }
    }
}
