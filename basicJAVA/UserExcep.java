import java.io.*;
class MyException extends Exception
{
    MyException(String mg)
    {
        super(mg);
    }
}
public class UserExcep
{
    public static void main(String args[])throws IOException
    {
        BufferedReader bin=new BufferedReader(new InputStreamReader(System.in));
        int a,b;
        System.out.println("Enter the value of A");
        a=Integer.parseInt(bin.readLine());
        System.out.println("Enter the value of B");
        b=Integer.parseInt(bin.readLine());
        try
        {
            int c=a+b;
            if(c>99)
            throw new MyException("The numbers are too big");
            System.out.println(a+"+"+b+"="+c);
        }
        catch(MyException e)
        {
            System.out.println("The sum of the numbers should be less than 99");
            System.out.println(e.getMessage());
        }
    }
}