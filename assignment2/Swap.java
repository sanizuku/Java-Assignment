import java.util.Scanner;
class Swap
{
public static void main(String args[])
{
int temp;
Scanner sc = new Scanner(System.in);
System.out.println("Input first number:");
int a = sc.nextInt();
System.out.println("Input second number:");
int b = sc.nextInt();
System.out.println("Before swap");
System.out.println("a = "+a);
System.out.println("b = "+b);

 temp=a;
  a=b;
  b=temp;
System.out.println("After swap");
System.out.println("a = "+a);
System.out.println("b = "+b);
}
}
