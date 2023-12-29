import java.util.*;
public class prime
{
public static void main (String args[])
{
int n,d,rev=0;
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number");
n= sc.nextInt();
for(int i=n; i>0; i=i/10)
{
d=i%10;
rev= rev*10+d;
}
System.out.println("The reverse number is"+ rev);
}
}
