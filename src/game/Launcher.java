package game;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import display.Display;
import piece.Piece;
import piece.PieceGenerator;

public class Launcher{
	public static void main(String[] args) {
		
		BlockingQueue<Piece> queue = new ArrayBlockingQueue<Piece>(1);
		
		NextPieceThread npt = new NextPieceThread(queue);
		GameThread GT = new GameThread(queue);

        npt.start();
        GT.start();
	}

}
