package game;

import java.util.concurrent.BlockingQueue;

import piece.Piece;
import piece.PieceGenerator;

public class NextPieceThread extends Thread {

	private NextPieceScene scene;
	private NextPieceLoop loop;
	private BlockingQueue<Piece> queue;

	public NextPieceThread(BlockingQueue<Piece> queue) {
		this.scene = new NextPieceScene(300, 300, queue);
		this.loop = new NextPieceLoop(this.scene, queue);
		this.queue = queue;

	}

	@Override
	public void run() {
		this.loop.run();
	}

}
