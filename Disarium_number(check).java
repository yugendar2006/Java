import java.util.*;
class DisariumNumber 
{
    static int noofdigits(int n)
    {
        int nd=0;
        while(n!=0)
        {
            nd++;
            n=n/10;
        }
        return nd;
    }
static int pow(int x,int y)
{
    int p=1;
    for(int i=1;i<=y;i++)
    {
        p=p*x;
    }
    return p;
}
static boolean isDisarium(int n,int nd)
{
    int sum=0,temp=n;
    while(n!=0)
    {
        int r=n%10;
        sum=sum+pow(r, nd);
        n=n/10;
        nd--;
    }
    if(temp==sum)
             return true;
     return false;
}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int nd=noofdigits(n);
    boolean flag=isDisarium(n,nd);
    if(flag)
          System.out.println("Disarium");
    else
          System.out.println("not");
}
}

