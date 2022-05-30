package display;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

import game.NextPieceScene;

public class NextPieceDisplay extends JFrame {

	private Canvas canvas;

	public NextPieceDisplay(int width, int height) {
		setTitle("Next Piece");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width, height));
		canvas.setFocusable(false);
		add(canvas);
		pack();
		
		canvas.createBufferStrategy(2);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void clear(Graphics graphics) {
		graphics.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
	}
	
	public void render(NextPieceScene scene) {
		BufferStrategy bufferStrategy = canvas.getBufferStrategy();
		Graphics graphics = bufferStrategy.getDrawGraphics();
		clear(graphics);
		scene.getPieces().forEach((piece) -> piece.render(graphics));
		graphics.dispose();
		bufferStrategy.show();
	}

}
