/********************************************
 * Sample solution for Activity 4.9.3 
 ********************************************/
public class FishingGameRunner
{
  public static void main(String[] args)
  {
    Player player = new Player();
    GameGUI gameGUI = new GameGUI(player);
   
    // setup all the components of the game
    gameGUI.playGame();
  }
}

/*
1) Method overriding is when both the parent and child class have the same method . 
2) You would reorganize the class hierarchy by using the bait and hook methods. These methods would apply to the ShopObject parent class, while everything else would reside in the GameObject class. The attributes and behaviors that would reside in these classes are the ability to call/access them with the super() method. 
*/
