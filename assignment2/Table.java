import java.util.Scanner;
class Table
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Input a number:");
int n1 = sc.nextInt();
for(int i=1;i<=10;i++)
{
System.out.println(n1+" x "+i+" = "+n1*i);
}
}
}