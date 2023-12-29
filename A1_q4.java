import java.util.*;
public class prime
{
public static void main (String args[])
{
int N,f;
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number");
N= sc.nextInt();
System.out.println("Prime numbers till"+ N+"are:");
for(int i=2; i<N; i++)
{
f=0;
for(int j=2; j<i; j++)
{
if(j%i==0)
f++;
}
if(f==0)
System.out.println(i);
}
}
}
