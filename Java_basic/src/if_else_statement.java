import java.util.Scanner;

public class if_else_statement
{
    public static void main(String args[])
    {
        int year;
        System.out.println("Enter the year :");
        Scanner in=new Scanner(System.in);
        year=in.nextInt();
        if((year%4 == 0) | (year % 100 != 0 ) | (year % 400 == 0))
        {
            System.out.println("This is a leap year");
        }
        else
        {
            System.out.println("This is not a leap year");
        }
    }

}
