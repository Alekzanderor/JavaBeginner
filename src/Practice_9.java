import java.util.Scanner;

public class Practice_9 {

    public static void main(String[] args)
    {
        //ввод массива
        Scanner sc = new Scanner(System.in);
        System.out.println("Input array size: ");
        int size=sc.nextInt();
        int arrayInt[] = new int[size];
        System.out.println("Input array elements: ");
        for (int i=0; i<size; i++)
        {
            int arrayElement = sc.nextInt();
            System.out.print(" ");
            arrayInt[i]=arrayElement;
        }

        //вывод  массива x2
        System.out.println("2x array: ");
        for (int i=0; i<size; i++)
        {
            System.out.print(arrayInt[i]*2+" ");
        }

    }
}