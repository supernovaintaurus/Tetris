package game;

public class GameThread extends Thread {
     Game game;
   public void run(){
       System.out.println("Game1");
        Game game = new Game("my tetris");
        game.run();
    }


}
