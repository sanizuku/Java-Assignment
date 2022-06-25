import java.util.Scanner;
class All
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Input first number:");
int n1 = sc.nextInt();
System.out.println("Input first number:");
int n2 = sc.nextInt();
int sum=(n1+n2),sub=(n1-n2),mul=(n1*n2),div=(n1/n2),mod=(n1%n2);
System.out.println(sum);
System.out.println(sub);
System.out.println(mul);
System.out.println(div);
System.out.println(mod);
}
}