import java.util.*;
public class prime
{
public static void main (String args[])
{
int n,d,f;
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number");
n= sc.nextInt();
for(int i=n; i>0; i=i/10)
{
d=i%10;
f++;
}
System.out.println("No. Of the digits are:"+ f);
}
}
