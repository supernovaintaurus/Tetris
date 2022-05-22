package piece;

import game.FieldSquare;
import java.awt.Color;

public class PieceShapeU extends PieceShape {
        private static final Color COLOR = Color.YELLOW;
        private static final FieldSquare[][][] SHAPES = {
                {
                        { FieldSquare.PIECE, FieldSquare.EMPTY, FieldSquare.PIECE, FieldSquare.EMPTY },
                        { FieldSquare.PIECE, FieldSquare.EMPTY, FieldSquare.PIECE, FieldSquare.EMPTY},
                        { FieldSquare.PIECE, FieldSquare.PIECE, FieldSquare.PIECE, FieldSquare.EMPTY},
                        { FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY}
                },
                {
                        { FieldSquare.PIECE, FieldSquare.PIECE, FieldSquare.PIECE, FieldSquare.EMPTY },
                        { FieldSquare.PIECE, FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY },
                        { FieldSquare.PIECE, FieldSquare.PIECE, FieldSquare.PIECE, FieldSquare.EMPTY },
                        { FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY }
                },
                {
                        { FieldSquare.PIECE, FieldSquare.PIECE, FieldSquare.PIECE, FieldSquare.EMPTY },
                        { FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.PIECE, FieldSquare.EMPTY },
                        { FieldSquare.PIECE, FieldSquare.PIECE, FieldSquare.PIECE, FieldSquare.EMPTY },
                        { FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY }
                },
                {
                        { FieldSquare.PIECE, FieldSquare.PIECE, FieldSquare.PIECE, FieldSquare.EMPTY },
                        { FieldSquare.PIECE, FieldSquare.EMPTY, FieldSquare.PIECE, FieldSquare.EMPTY },
                        { FieldSquare.PIECE, FieldSquare.EMPTY, FieldSquare.PIECE, FieldSquare.EMPTY },
                        { FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY }
                }
        };

        public PieceShapeU() {
            super();
        }

        @Override
        public Color getColor() {
            return piece.PieceShapeU.COLOR;
        }

        @Override
        protected FieldSquare[][][] getShapes() {
            return piece.PieceShapeU.SHAPES;
        }
    }

