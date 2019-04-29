public class gameTextt
{

	public gameTextt ()
	{

	}	

	public void currentGen ()
	{
		 System.out.println("Current Generation");
	}

	public void futureGen ()
	{
		System.out.println("Next Generation");
	}

	public void welcome ()
	{
		System.out.println("\nWelcome To The Game of Life\n\nPress Enter To Begin");
	}
	
	public void gameOver()
	{

		System.out.println("Game Over");
	}
	

	public void selectPattern()
	{
		System.out.println("Please select:\t 1)Glider \t2)Exploder \t3)Blinker (Oscillator)\n \t4)Toad (Oscillator) \t5)Block (Still Life) \t6)Quit Game");

	}


	public void sleepMsg()
	{
		System.out.println("How long wowuld you like the game to sleep between generations ");
		System.out.println("\t(1000 = 1 sec.)");		

	}

	public void startGame()
	{
		System.out.println("Press enter to start generations!");
	}

	public void howRows()
	{
		System.out.println("How many rows would you like to have?");
	}

	public void howCols()
	{
		System.out.println("How many columns would you like to have?");
	}

	public void numofGens()
	{
		System.out.println("How many generations would you like to have?");
	}

}