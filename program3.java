import java.io.*;
import java.util.*;
import java.net.*;
public class table
{
public static void main(String args[ ])
int a,i;
System.out.println("enter the number");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
for(i=0;i<=100;i++)
{
System.out.println(a+"*"+i+"="+a*i);
}
}
