package game1;

public class WinnigPossibilities {
	public static boolean check(int coordinates1,int coordinates2,String[][]gameBoard){
		 int flags=1;
		       if((gameBoard[coordinates1][coordinates2]=="x")||(gameBoard[coordinates1][coordinates2]=="o")){
		               flags=0;

		       }


		   if(flags==0)
		   return false;
		   else
		   return true;
		}
	public static String checkWinner(String [][] gameboard) {
		 String result="";

		   for (int line = 0; line < 8; line++) {
		       String wincheck = null;
		      		       switch (line) {
		       case 0:
		           wincheck = gameboard[0][0] + gameboard[0][1] + gameboard[0][2];
		           break;
		       case 1:
		           wincheck = gameboard[1][0] + gameboard[1][1] + gameboard[1][2];
		           break;
		       case 2:
		           wincheck = gameboard[2][0] + gameboard[2][1] + gameboard[2][2];
		           break;
		       case 3:
		           wincheck = gameboard[0][0] + gameboard[1][1] + gameboard[2][2];
		           break;
		       case 4:
		           wincheck = gameboard[0][1] + gameboard[1][1] + gameboard[2][1];
		           break;
		       case 5:
		       wincheck = gameboard[0][2] + gameboard[1][2] + gameboard[2][2];
		           break;
		       case 6:
		           wincheck = gameboard[0][0] + gameboard[1][1] + gameboard[2][2];
		           break;
		       case 7:
		           wincheck = gameboard[0][2] + gameboard[1][1] + gameboard[2][0];
		           break;
		       }
		       if ((wincheck.equals("xxx"))) {
		           result="Player 1 Wins the Game!";
		      	 //System.exit(0);
		       }
		       else if((wincheck.equals("ooo"))) {
		           result="Player 2 Wins the Game!";
		      	 //System.exit(0);

		       }
		   }
		return result;			
}
}
