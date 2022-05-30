package game;

import java.util.concurrent.BlockingQueue;

import piece.Piece;

public class GameThread extends Thread {
	Game game;
	BlockingQueue<Piece> queue;

	public GameThread(BlockingQueue<Piece> queue) {
		this.queue = queue;
	}

	public void run() {
		game = new Game("my tetris", queue);
		System.out.println("Game1");
		game.run();
	}

}
