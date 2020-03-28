import java.util.Scanner;

public class Practice_15 {

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

        //сортировка//

        for(int i = size - 1; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++) {
                if (arrayInt[j] > arrayInt[j+1]) {
                    int temp = arrayInt[j];
                    arrayInt[j] = arrayInt[j+1];
                    arrayInt[j+1]=temp;
                }
            }
        }

        //вывод отсортированного массива
        System.out.println("Sorted array: ");
        for (int i=0; i<size; i++)
        {
            System.out.print(arrayInt[i]+" ");
        }

    }
}