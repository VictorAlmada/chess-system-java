package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {
	//atributos
	private Color color;
	
	//contrutor
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	
	//getter de color
	public Color getColor() {
		return color;
	}
	
}
