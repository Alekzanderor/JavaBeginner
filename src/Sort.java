import java.util.Scanner;

public class Sort {

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

        //сортировка
        int temp, j;
        for(int i = 0; i < size - 1; i++){
            if (arrayInt[i] > arrayInt[i + 1]) {
                temp = arrayInt[i + 1];
                arrayInt[i + 1] = arrayInt[i];
                j = i;
                while (j > 0 && temp < arrayInt[j - 1]) {
                    arrayInt[j] = arrayInt[j - 1];
                    j--;
                }
                arrayInt[j] = temp;
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
