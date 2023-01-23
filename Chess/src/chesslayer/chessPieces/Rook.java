package chesslayer.chessPieces;

import boardgame.Board;
import chesslayer.ChessPiece;
import chesslayer.Color;

public class Rook extends ChessPiece {
    public Rook(Board board, Color color){
        super(board,color);
    }

    @Override
    public String toString(){
        if(this.getColor() == Color.WHITE)  return "(" + Character.toString((char) (i+65)) + ")";
        return "♜";
    }
}
