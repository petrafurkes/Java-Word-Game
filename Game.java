/*Software Development - Project
- Java Word Game-
HDCOMP, Year 1
@author Petra Furkes, 8th of May, 2020.
*/

public class Game{
	//declare instance variables
	private String playerFirstName;
	private String playerSecondName;
	private int playerFirstPoints;
	private int playerSecondPoints;
	private String vWordFPlayer;
	private String vWordSPlayer;
	private String iWordFPlayer;
	private String iWordSPlayer;
	private int roundNumber;
	private int playerFirstCounter;
	private int playerSecondCounter;
	private int playerFirstLives;
	private int playerSecondLives;


	//constructor
	public Game(){
		this.roundNumber = 0;
		this.playerFirstPoints = 0;
		this.playerSecondPoints = 0;
		this.vWordFPlayer = " ";
		this.vWordSPlayer = " ";
		this.iWordFPlayer = " ";
		this.iWordSPlayer = " ";


	}
//FIRST AND SECOND PLAYERS
	//setters
	//setter to store name of the first player in playerFirstName variable
	public void setFirstPlayerName(String nameFirst){
		this.playerFirstName = nameFirst;
		}

	//setter to store name of the second player in playerSecondName variable
		public void setSecondPlayerName(String nameSecond){
			this.playerSecondName = nameSecond;
		}
	//getters
	// getter for first player's names
	public String getFirstPlayerName(){
		return playerFirstName;
	}
	// getter for second player's names
	public String getSecondPlayerName(){
			return playerSecondName;
	}


//VALIDATED WORDS PROVIDED BY FIRST AND SECOND PLAYERS
	//setter for validate word will store validated word provided by first player
	public void setValidWordFirstPlayer(String pWordFPlayer){
			this.vWordFPlayer = pWordFPlayer;
	}
	//getter for valid word provided by first player
	public String getValidWordFirstPlayer(){
		return vWordFPlayer;
	}
	//setter for validate word will store validated word provided by second player
	public void setValidWordSecondPlayer(String pWordSPlayer){
		this.vWordSPlayer = pWordSPlayer;
	}
	//getter for valid word provided by second player
	public String getValidWordSecondPlayer(){
		return vWordSPlayer;
	}


//INVALID WORDS PROVIDED BY FIRST AND SECOND PLAYERS
	//setter for invalidate word will store invalid word provided by first player
	public void setInValidWordFirstPlayer(String inWord){
		this.iWordFPlayer = inWord;
	}
	//getter for invalid word provided by first player
	public String getInValidWordFirstPlayer(){
		return iWordFPlayer;
	}
	//setter for invalidate word will store invalid word provided by second player
	public void setInValidWordSecondPlayer(String inWord){
		this.iWordSPlayer = inWord;
	}
	//getter for invalid word provided by second player
	public String getInValidWordSecondPlayer(){
		return iWordSPlayer;
	}
//ROUND
	//getter for round number
	public int getRoundNumber(){
		roundNumber = roundNumber + 1;
		return roundNumber;
	}
//POINTS
	//setters for players points
	//first player
	public void setFirstPlayerPoints(int fpPoints){
		this.playerFirstPoints = fpPoints;
	}
	//second player
	public void setSecondPlayerPoints(int spPoints){
		this.playerSecondPoints = spPoints;
	}

	//getters for players points
	//first player
	public int getFirstPlayerPoints(){
		return playerFirstPoints;
	}
	//second player
	public int getSecondPlayerPoints(){
			return playerSecondPoints;
	}

	//setters for upgrading players points
	//first player
	public void setFirstPlayerCounter(int playerFirstCounter){
		this.playerFirstCounter++;
	}
	//second player
	public void setSecondPlayerCounter(int playerSecondCounter){
		this.playerSecondCounter++;
	}

	//getters for upgrading players points
	//first player
	public int getFirstPlayerCounter(){
		return playerFirstCounter;
	}
	//second player
	public int getSecondPlayerCounter(){
		return playerSecondCounter;
	}


//RESET GAME
	public void resetGame(){
	this.roundNumber = 0;
	this.playerFirstPoints = 0;
	this.playerSecondPoints = 0;
	this.playerFirstCounter = 0;
	this.playerSecondCounter = 0;

	}


}










