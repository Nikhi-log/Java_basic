import java.util.Scanner;

/*
Else if ladder
eg: grade analysis

90-100  Grade-A
80-89   Grade-B
70-79   Grade-C
<70     Grade-D
 */
public class else_if_ladder
{
    public static void main(String args[])
    {
        float avg;
        System.out.println("Enter the Average Mark : ");
        Scanner in =new Scanner(System.in);
        avg=in.nextFloat();
        if(avg>=90 && avg<=100)
        {
            System.out.println("Grade A");
        }
        else if(avg>=80 && avg<=89)
        {
            System.out.println("Grade B");
        }
        else if(avg>=70 && avg<=79)
        {
            System.out.println("Grade C");
        }
        else
        {
            System.out.println("Grade D");
        }
    }
}
