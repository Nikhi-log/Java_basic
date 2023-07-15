import java.util.Scanner;

public class Getting_input
{
    public static void main(String agrs[])
    {
        //getting input scanner class in Java
        Scanner in=new Scanner(System.in);// system represents the constructed value and denotes it in input as in
        float a,b,c;
        //a^2+b^2+2ab
        System.out.println("Enter two number :");
        a= in.nextFloat();
        b=in.nextFloat();
        c=(a*a)+(b*b)+(2*a*b);
        System.out.println("Result ="+c);
    }
}
/*
in.nextInt();
in.nextFloat();
in.nextDouble();
in.next();        for word
in.nextLine();    for line
 */