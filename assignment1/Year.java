import java.util.*;
class Year
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter year");
int y = sc.nextInt();
if((y%400==0) ||(y%4==0) && (y%100!=0))
System.out.println("It is a leap year");
else
System.out.println("It is not a leap year");
}
}