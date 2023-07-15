import java.util.Scanner;

public class nested_if
{
    /*
    Nested if Statement
    Ques: a company insures its drives in the following cases:
                a. If the driver is married
                b. If the driver is unmarried, male & above 30 years of age
                c. If the driver is unmarried, female & above 25 years of age
     */
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the marital status M/U :   ");
        char marital=in.next().charAt(0);
        if(marital=='u' || marital=='U')
        {
            System.out.println("Enter your Gender M/F:  ");
            char Gender=in.next().charAt(0);
            System.out.println("Enter your age: ");
            int age=in.nextInt();
            if((Gender=='m' || Gender=='M') && (age>=30))
            {
                System.out.println("You are Eligible for the Insurance..");
            }
            else if((Gender=='f' || Gender=='F') && (age>=25))
            {
                System.out.println("You are Eligible for the Insurance..");
            }
            else
            {
                    System.out.println("You are not Eligible for the Insurance..");
            }
        }
        else if(marital=='m' || marital=='M')
        {
                System.out.println("You are not Eligible for the Insurance..");
        }
        else
        {
                System.out.println("Invalid data");
        }
    }
}
