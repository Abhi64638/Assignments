import java.util.Scanner;

public class Program3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for which you want to print the table...");
		int a = sc.nextInt();
		
		for (int i = 0; i < 10; i++)
		{
			System.out.println(a +" * "+(i+1)+ " = "+a*(i+1));
		}
	}
}
