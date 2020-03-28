import java.util.Scanner;

public class Practice_13 {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input text1: ");
        String text1=sc.nextLine();

        System.out.println("Input text2: ");
        String text2=sc.nextLine();

        if(text1.length()==text2.length())
        {
            System.out.println("Texts have the same length ");
        }
else {
    if(text1.length()>text2.length()){
        System.out.println("Text1 longer ");
        System.out.println(text1);
            }
    else{
        System.out.println("Text2 longer ");
        System.out.println(text2);
    }
        }


    }

}