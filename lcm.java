import java.util.*;
import java.lang.*;
import java.io.*;
public class lcm{
public static void main(String []args){
int a,b,max,min,x,lcm=1;
Scanner s=new Scanner(System.in);
      a=s.nextInt();
b=s.nextInt();

if(a>b)
{
max=a;
min=b;
}
else
{
max=b;
min=a;
}
 for(int i=1;i<=min;i++)
   {
    x=max*i;
    if(x%min==0) 
     {
      lcm=x; 
      break; 
     }
    }
System.out.println("L.C.M. = "+lcm);
}

}
