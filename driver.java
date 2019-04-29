import java.util.Random;
import java.util.Scanner;

public class driver extends world{

 

public static void main(String [] args){

 

 int sleep = 0;
 int patt = 0;
 int rows = 0;
 int cols = 0;
 int genMax = 0;
 

Scanner in = new Scanner(System.in);
 int userChoice;

 

 world world = new world(rows, cols); 

 world.setGameBoard();

Scanner input = new Scanner(System.in);
gameTextt printText = new gameTextt();

printText.welcome();
new Scanner(System.in).nextLine();

printText.howRows();
rows = input.nextInt();

printText.howCols();
cols = input.nextInt();

printText.numofGens();
genMax = input.nextInt();

printText.selectPattern();
patt = input.nextInt();

printText.sleepMsg();
sleep = input.nextInt();

printText.startGame();
new Scanner(System.in).nextLine();

if (patt != 7)
{
  if (patt == 1) {
   world.putGlider(0,0);
 
  }
 else if (patt == 2)
 {
  world.putExploder(3,2);
  }
  else if (patt == 3)
  {
  world.putBlinker(3,3);
  }
  else if (patt == 4)
  {
    world.putToad(3,3);
  }
  else if (patt == 5)
  {
    world.putBlock(3,3);
  }
  else if (patt == 6)
  {
    System.exit(0);
   printText.gameOver(); 
   return;
  }
}


 

System.out.println("original Glider Pattern");

  

  world.printGameBoard();

 

  for(int i = 0; i <= genMax;i++){

 


	System.out.println( "Generation "+ i);

 //world2.putGlider();

 world.printGameBoard(); //print world

 world.nextGen();   //wolrd update



 

 

  	//sleep

  

  try

   {

    Thread.sleep(sleep);

   }

   catch(Exception ex)

   {

    System.out.println("Exception:"+ex.getStackTrace());

     	}



 

  }//end of for loop

 printText.gameOver();

}
}//end of main
// end of class 
