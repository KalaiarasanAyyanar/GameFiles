package game1;
import java.util.Scanner;
public class TicTacToe {

	public static void main(String args[]) {
	@SuppressWarnings("resource")
	Scanner s=new Scanner(System.in);
	String[][] gameBoard={{"1","2","3"},{"4","5","6"},{"7","8","9"}};
	int turnCount;
	for(turnCount=1;turnCount<10;turnCount++){
	  boolean flag=Positioning.setPlayer(turnCount);
	  DisplayBoard.displayGame(gameBoard);
	  System.out.println("Player "+((flag)?"1":"2")+"'s turn");
	  int playerChoice=s.nextInt();
	  if(playerChoice>=1&&playerChoice<=9){
		  int[] coordinates=Positioning.getCoordinates(playerChoice,gameBoard);
		  if(coordinates[0]<3&&coordinates[1]<3){
			  gameBoard[coordinates[0]][coordinates[1]]=((flag)?"x":"o");
		  }
		  else{
			  System.out.println("the place is already occupied");
			  turnCount=turnCount-1;
		  }
	    }
	    else if(playerChoice>=10||playerChoice<1){
	    		System.out.println("Invalid input");
	    		turnCount=turnCount-1;
	     }
	     String out="";
	     out = WinnigPossibilities.checkWinner(gameBoard);
	     System.out.println(out);
		 if(out!="") {
			 System.exit(0);
		 }
	}
	 //checkWinner(gameBoard)
	 if(turnCount==10) {
		 System.out.print("Match draw\n");
	 }
	DisplayBoard.displayGame(gameBoard);
	}
	}
	

