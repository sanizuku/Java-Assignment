import java.util.*;
class Factorial
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter number");
int fact = sc.nextInt();
for(int i=1;i<=fact;i++)
{
fact=fact*i;
System.out.println(fact);
}
}
}