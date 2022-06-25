import java.util.Scanner;
class Average
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Input first number:");
int n1 = sc.nextInt();
System.out.println("Input second number:");
int n2 = sc.nextInt();
System.out.println("Input third number:");
int n3 = sc.nextInt();
float avg=(n1+n2+n3)/3;
System.out.println(avg);
}
}