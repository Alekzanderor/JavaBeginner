import java.io.*;


public class Practice_16 {

    public static void main(String[] args) {

        String text;
        try(BufferedReader br= new BufferedReader(new FileReader("Practice_16.txt")))
        {
            while ((text=br.readLine())!=null)
            {
                System.out.println(text);
            }
        }
        catch (IOException exc)
        {
            System.out.println("Error IO:"+exc);
        }
    }
}