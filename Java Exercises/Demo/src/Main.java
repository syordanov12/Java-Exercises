import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
     int b = scanner.nextInt();
     if (b>a)
     {
         System.out.println("Yes, b is greater than a");
     }
     else if(a==b)
     {
       System.out.println("a and b are equal");
     }
     else
     {
       System.out.println("a is greater than b");
     }

    }
}