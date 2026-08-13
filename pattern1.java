import java.util.*;
class pattern1
{
    static void generate(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    generate(n);
    }

} 



import java.util.*;
class pattern3
{
    static void generate(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            if(i==1 || i==n || j==1 || j==n)
            System.out.print("*");
            else
            System.out.print("");
        System.out.println();
        }

    }
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    generate(n);
    }
} 

import java.util.*;
class pattern3
{
    static void generate(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            if(i==1 || i==n || j==1 || j==n){
            System.out.print("* ");
            }
            else{
            System.out.print("  ");
            }
        System.out.println();
        }

    }
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    generate(n);
    }
} 