import java.util.Scanner;

public class Practice_10 {

    public static void main(String[] args)
    {
        //ввод массива
        Scanner sc = new Scanner(System.in);
        System.out.println("Input array columns: ");
        int columns=sc.nextInt();
        System.out.println("Input array rows: ");
        int rows=sc.nextInt();
        int arrayInt[][] = new int[columns][rows];
        System.out.println("Input array elements: ");
        for (int i=0; i<rows; i++)
        {
            for(int j=0;j<columns;j++)
            {
            int arrayElement = sc.nextInt();
            System.out.print(" ");
            arrayInt[i][j]=arrayElement;
            }
        }

        //вывод  массива x2
        System.out.println("3x first row: ");
        for (int i=0; i<1; i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(arrayInt[i][j]*3+" ");
            }
            System.out.println();
        }

    }
}