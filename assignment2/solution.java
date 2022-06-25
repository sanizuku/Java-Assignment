import java.util.Scanner;
public class sol{

public static int pallindrome(int x){
int r,sum=0,temp;
temp=x;
while(x>0){
r=x%10;
sum =(sum*10)+r;
x=x/10;
if (sum==x)
return sum;
else
returm 0;
}
}
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
int x= sc.nextInt();
System.out.println(pallindrome(x));