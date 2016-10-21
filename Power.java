import java.io.*;
class Power
{
public static void main(String args[])
{
try
{
DataInputStream in=new DataInputStream(System.in);
int number,power,result;
number=Integer.parseInt(in.readLine());
power=Integer.parseInt(in.readLine());
if((number!=0)&&(power!=0))
{
if((power!=0)&&(power>0))
{
System.out.println(Math.pow(number,power));
}
}
else
{
System.out.println("Invalid data");
}
}
catch(Exception e)
{
}
}
}
