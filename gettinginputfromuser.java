import java.util.Scanner;
public class gettinginputfromuser
{
	public static void main(String[] args)
	{
		System.out.println("Enter a variable:");
		Scanner a = new Scanner(System.in);
		System.out.println("The variable is: "+ a.nextLine());
	}
}