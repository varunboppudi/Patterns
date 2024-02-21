// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void p1(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void p2(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void p3(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void p4(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i+1;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void p5(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void p6(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(j-i+1);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void p7(int n)
    {
        for(int i=1;i<=n;i++) {

            for (int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j < 2 * i; j++)
            {
                System.out.print("*");
            }
            for (int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void p8(int n)
    {
        for(int i=1;i<=n;i++) {

            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * (n-i); j++)
            {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void p9(int n)
    {
        for(int i=1;i<=n;i++) {

            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            for (int j = 1; j < n; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++) {

            for (int j = 0; j < n-i; j++)
            {
                System.out.print("*");
            }
            for (int j = 1; j < n; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void p10(int n)
    {
        int m=n;
        for(int i=1;i<2*n;i++)
        {
            for(int j=1;j<2*n;j++)
            {
               int top=i;
               int left=j;
               int right=(2*n)-j;
               int bottom=(2*n)-i;
               System.out.print(n+1-Math.min(Math.min(top,bottom),Math.min(left,right)));
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     p1(n);p2(n);p3(n);p4(n);p5(n);p6(n);p7(n);p8(n);p9(n);p10(n);

    }
}