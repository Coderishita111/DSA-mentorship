import java.util.*;
public class prime
{
public static void main (String args[])
{
int m;
Scanner sc= new Scanner(System.in);
System.out.println("Enter marks");
m= sc.nextInt();
if(m>90)
System.out.println("Excellent");
else if(m<=90 && m>80)
System.out.println("Good");
else if(m<=80 && m>70)
System.out.println("Fair");
else if(m<=70 && m>60)
System.out.println("Meets expectations");
else if(m<=60)
System.out.println("Below par");
}
}
