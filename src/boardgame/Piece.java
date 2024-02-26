package boardgame;

public class Piece {
	
	//atributos de peça
	protected Position position;
	private Board board;
	
	//construtor
	public Piece(Board board) {
		this.board = board;
		// position = null;
	}
	
	//getter de board
	protected Board getBoard() {
		return board;
	}
	
}
