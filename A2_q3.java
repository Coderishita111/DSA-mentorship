import java.util.*;
public class pattern
{
public static void main (String args[])
{
int n,i,k,j;
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number");
n= sc.nextInt();
for(i=1;i<=n;i++)
{
 for(j=1:j<=n-i;j++)
{
System.out.print(" ");
}
for(k=1;k<=i;k++)
System.out.print("*");
System.out.println();
}
}
}
