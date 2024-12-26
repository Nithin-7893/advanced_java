class Exceptions
{
public static void main(String args[])
{
try 
{
int i= 5 / 0;
System.out.println("**REMAINING CODE IS NOT EXECUTED");
}
catch (ArithmeticException a)
{
System.out.println("ArithmeticException => " + a);
}
System.out.println("**REMAINING CODE IS EXECUTED**");
}
}