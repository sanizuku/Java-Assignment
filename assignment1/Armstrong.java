import java.util.*;
class Armstrong
{
public static void main(String args[])
{
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter number");
   int n= sc.nextInt();
   int temp = n;
   int sum=0;
   int res;
   while(n>0)
   {
     res=n%10;
	 sum=sum+(res*res*res);
	 n=n/10;
}
if(temp == sum)
System.out.println("Armstrong");
else
System.out.println("Not Armstrong");
}
}