import java.util.Scanner;

public class Runner 
{
	public static void main(String[] args) 
	{	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Direction");

		String name = sc.nextLine();
		//System.out.println();

		 Player.getDirectionInput(name);
		 
	}
}
