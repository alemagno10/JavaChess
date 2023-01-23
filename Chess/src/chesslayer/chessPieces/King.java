package chesslayer.chessPieces;

import boardgame.Board;
import chesslayer.ChessPiece;
import chesslayer.Color;

public class King extends ChessPiece{

    public King(Board board, Color color) {
        super(board, color);
    }

    public String toString(){
        if(this.getColor() == Color.WHITE)  return "♔";
        return "♚";
    }
}
