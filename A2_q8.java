import java.util.*;
public class pattern
{
public static void main (String args[])
{
int n,i,j;
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number");
n= sc.nextInt();
for(i=n;i>=1;i--)
{
 for(j=1:j<=i-1;j++)
{
System.out.print(" ");
}
System.out.print("*");
System.out.println();
}
}
}
