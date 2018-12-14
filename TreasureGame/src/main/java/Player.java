
public  class Player extends Main

{
	private static int x = 0;
	
	private static int y = 0;
	
	
	public int getX() 
	{
		return x;
	}
	
	public void setX(int x) 
	{
		Player.x = x;
	}
	
	
	public int getY() 
	{
		return y;
	}
	
	public void setY(int y) 
	{
		Player.y = y;
	}
	
	public static void getDirectionInput(String direction) 
	{
		if(direction.equals("North"))
		{
			x += 1;
			
			System.out.println("You moved North");
		}
		
		else if(direction.equals("South"))
		{
			x -= 1;
			
			System.out.println("You moved South");
		}
		
		else if(direction.equals("East"))
		{
			y += 1;
			
			System.out.println("You moved East");
		}
		
		else if(direction.equals("West"))
		{
			y -= 1;
			
			System.out.println("You moved West");
			
		}
	}
}
