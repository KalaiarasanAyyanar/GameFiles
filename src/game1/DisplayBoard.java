package game1;

public class DisplayBoard {
	public static void displayGame(String[][] gameBoard)
	{

	 for(int row=0;row<3;row++)
	   {

	   for(int column=0;column<3;column++)

	 {

	  System.out.print(gameBoard[row][column]+"  ");

	  }

	System.out.println("");

	}
	}
}
