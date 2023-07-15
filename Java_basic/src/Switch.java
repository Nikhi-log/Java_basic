import java.util.Scanner;

//Switch case statement in java
public class Switch
{
    public static void main(String args[])
    {
        int a,b,c,ch;
        System.out.println("1.Addition");
        System.out.println("2.Subtraction ");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter your choices : ");
        Scanner in=new Scanner(System.in);
        ch=in.nextInt();
        System.out.println("Enter two numbers : ");
        switch (ch)
        {
            case 1:
                a=in.nextInt();
                b=in.nextInt();
                c=a+b;
                System.out.println("Addition : "+c);
                break;
            case 2:
                a=in.nextInt();
                b=in.nextInt();
                c=a-b;
                System.out.println("Subtraction : "+c);
                break;
            case 3:
                a=in.nextInt();
                b=in.nextInt();
                c=a*b;
                System.out.println("Multiplication : "+c);
                break;
            case 4:
                a=in.nextInt();
                b=in.nextInt();
                c=a/b;
                System.out.println("Division : "+c);
                break;
            default:
                System.out.println("Invaild number");

        }

    }
}