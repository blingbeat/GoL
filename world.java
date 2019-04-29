
public class world extends Patterns{

//Members

private char[][] gameBoard = new char[20][20];
private int numofRows;
private int numofCols;



//***Constructor

//No Arg Constructor

	public world (){

  

   this.numofRows = 0;

  	this.numofCols = 0;  

	}

 

// Constructor

	public world(int r, int c)

 { 

  this.numofRows = r;

    	this.numofCols = c;  

 }

 

 

 //getter

 public int getRows() {

  return numofRows;

 }

 

 public int getColumns() {

  return numofCols;

 }


//Creating the game board

public void setGameBoard()

{

  	for ( int i = 0; i < gameBoard.length; i++)

   {

  for(int j = 0; j < gameBoard[i].length; j++)

  {

   gameBoard[i][j] = ' ';

  

 	}

  

   }

}

//Putting the Glider pattern

public void putGlider(int r,int c)

 {

   //char[][] glider = new char [10][10];

  char pattern[][] = getGlider();

 	for ( int i = 0; i <pattern.length ; i++)

  {

  for(int j = 0; j < pattern[i].length; j++)

  {

   gameBoard[i+r][j+c] = pattern[i][j];

  }

  

  }

  

 }

 //Putting the exploder pattern

public void putExploder(int r,int c)

 {

   //char[][] glider = new char [10][10];

  char pattern[][] = getExploder();

  for ( int i = 0; i <pattern.length ; i++)

  {

  for(int j = 0; j < pattern[i].length; j++)

  {

   gameBoard[i+r][j+c] = pattern[i][j];

  }

  

  }

  // putting blinker pattern

 }

 public void putBlinker(int r,int c)

 {

   //char[][] blinker = new char [10][10];

  char pattern[][] = getBlinker();

  for ( int i = 0; i <pattern.length ; i++)

  {

  for(int j = 0; j < pattern[i].length; j++)

  {

   gameBoard[i+r][j+c] = pattern[i][j];

  }

  

  }

  

 }

 public void putToad(int r,int c)

 {

   //char[][] blinker = new char [10][10];

  char pattern[][] = getToad();

  for ( int i = 0; i <pattern.length ; i++)

  {

  for(int j = 0; j < pattern[i].length; j++)

  {

   gameBoard[i+r][j+c] = pattern[i][j];

  }

  

  }

  

 }

 public void putBlock(int r,int c)

 {

   //char[][] blinker = new char [10][10];

  char pattern[][] = getBlock();

  for ( int i = 0; i <pattern.length ; i++)

  {

  for(int j = 0; j < pattern[i].length; j++)

  {

   gameBoard[i+r][j+c] = pattern[i][j];

  }

  

  }

  

 }





//Getting the Game board

	public char[][] getGameBoard(){

  

  

  for(int i = 0; i < gameBoard.length;i++) {

   for(int j = 0; j < gameBoard[0].length;j++) {

   	gameBoard[2][3] = '*';

   	gameBoard[3][4] = '*';

   	gameBoard[4][2] = '*';

   	gameBoard[4][3] = '*';

   	gameBoard[4][4] = '*';

    	

   }

  }

    	return gameBoard;

 

	}

 

 //Prints the game board

public void printGameBoard(){

 

  System.out.println("                     	");

 

   	for (int i = 0; i < gameBoard.length;i++){

   	for(int j = 0; j < gameBoard[i].length;j++){

   

   

   System.out.print(gameBoard[i][j]);

   //System.out.print(glider[i][j] + " ");

  	}

  System.out.println("");

 	}

  

}



//Counts number of neighbors 

 

  private int countNeighbors(int r, int c) {

  int count = 0;

  

 	  if(inBound(gameBoard, r-1,c-1) && (gameBoard[r-1][c-1] == '*'))

    count++;

   

        	if(inBound(gameBoard,r-1,c) && (gameBoard[r-1][c] == '*'))

    count++;

        	if(inBound(gameBoard,r-1,c+1) && (gameBoard[r-1][c+1] == '*'))

    count++;

 

        	if(inBound(gameBoard,r,c-1) && (gameBoard[r][c-1] == '*'))

             	count++;    

        	if(inBound(gameBoard,r,c+1) && (gameBoard[r][c+1] == '*'))

    count++;

        	if(inBound(gameBoard,r+1,c-1) && (gameBoard[r+1][c-1] == '*'))

    count++;

        	if(inBound(gameBoard,r+1,c) && (gameBoard[r+1][c] == '*'))

    count++;

        	if(inBound(gameBoard,r+1,c+1) && (gameBoard[r+1][c+1] == '*'))

               	count++;    

  	

  return count;

  }

  

 

 

//Gets Neighbors

 

   public boolean inBound(char[][] w, int r, int c){

 if((r >= 0) && (r < w.length) && (c >= 0) && (c < w.length))

   return true;

	else

   return false;

  }

 

 

 

 

  //Creating the future generation

 

 public void nextGen(){

 

   char[][] nextGen = new char[20][20]; 

  

     	

   	for(int r = 0; r < gameBoard.length; r++){

 	for(int c = 0; c < gameBoard[r].length; c++){

	

  if(countNeighbors(r,c) == 3){

  	nextGen [r][c] = '*';   

  

  }

  else if ((gameBoard[r][c] == ' ') && (countNeighbors(r,c) == 3)){

   

   nextGen [r][c] = '*';  // cells is born

  }

  else if ((gameBoard[r][c] == '*') && ((countNeighbors(r,c) == 2 || countNeighbors(r,c) == 3 ))){

   

   nextGen [r][c] = '*'; // cells lives on

  }

  

  else if ((gameBoard[r][c] == '*') && (countNeighbors(r,c) < 2)){

   

   nextGen [r][c] = ' '; //Lonliness rule
  }

  

  else if ((gameBoard[r][c] == '*') && (countNeighbors(r,c) > 3)){

   

   nextGen [r][c] = ' ';  //overcrowding rule
  }

  

  else if ((gameBoard[r][c] == ' ' && (countNeighbors(r,c) > 3))){

   

   nextGen [r][c] = ' ';  //overcrowding rule

  }

	

 } 

 //System.out.println();

 

 }

   gameBoard = nextGen;

 }

 

}//end of World 






