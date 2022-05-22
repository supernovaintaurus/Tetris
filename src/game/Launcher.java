package game;

public class Launcher{
	public static void main(String[] args) {			
		GameThread GT = new GameThread();
        GameThread2 GT2 = new GameThread2();

        GT.start();
        GT2.start();
	}

}
