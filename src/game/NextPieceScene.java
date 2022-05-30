package game;

import java.util.concurrent.BlockingQueue;

import display.NextPieceDisplay;
import piece.Piece;

public class NextPieceScene {
	
	private NextPieceDisplay display;
	private BlockingQueue<Piece> queue;
	
	public NextPieceScene(int width, int height, BlockingQueue<Piece> queue) {
		display = new NextPieceDisplay(width, height);
		this.queue = queue;
	}
	
	public void render() {
		display.render(this);
	}
	
	public BlockingQueue<Piece> getPieces() {
		return queue;
	}

}
