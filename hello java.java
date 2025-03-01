import java.util.Scanner;
class HelloWorld
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String str=sc.nextLine();
        System.out.println("entered:"+str);
        sc.close();
    }
}