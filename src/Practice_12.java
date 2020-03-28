import java.util.Scanner;

public class Practice_12 {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input text: ");
        String text=sc.nextLine();

        String textSorted= text.replaceAll(" ","");

        System.out.println("Text without spaces: ");
        System.out.println(textSorted);

        }

    }

