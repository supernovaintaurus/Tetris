package game;

import java.util.concurrent.BlockingQueue;

import piece.Piece;
import piece.PieceGenerator;

public class NextPieceLoop implements Runnable {

	private boolean running = true;
	private NextPieceScene scene;
	private BlockingQueue<Piece> queue;

	public NextPieceLoop(NextPieceScene scene, BlockingQueue<Piece> queue) {
		this.scene = scene;
		this.queue = queue;
	}

	private void addGameObject(Piece piece) {
		queue.add(piece);
	}

	@Override
	public void run() {
		while (running) {
			synchronized (queue) {
				while (!queue.isEmpty()) {
					try {
						queue.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				addGameObject(PieceGenerator.generatePiece(0, 0));
			}
			scene.render();
		}
	}
}
