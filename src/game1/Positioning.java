package game1;

public class Positioning {
	public static boolean setPlayer(int turnCount)
	{

	if(turnCount%2==1)
	   {

	   return true;

	}

	else
	   {

	 return false;

	 }
	}

	public static int[] getCoordinates(int playerChoice,String[][] gameBoard){
		 playerChoice=playerChoice-1;

		 int[] coordinates=new int[2];

		coordinates[0]=(playerChoice/3);

		coordinates[1]=(playerChoice%3);

		boolean result=WinnigPossibilities.check(coordinates[0],coordinates[1],gameBoard);
		     if(result==true){
	   
		return coordinates;

		}
		else{
		 int [] invalidcoordinates=new int [2];
		 invalidcoordinates[0]=3;
		 invalidcoordinates[1]=3;
		 return invalidcoordinates;
		}

		}
}
