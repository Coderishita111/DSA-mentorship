import java.util.*;
public class prime
{
public static void main (String args[])
{
int n,f;
f=2;
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number");
n= sc.nextInt();
System.out.println("Prime factorisation is:");
for(int i=1;i<n/2;i++)
{
if(n%f==0)
{
n=n/f;
System.out.println(f);
}
else
f++;
}
}
}
