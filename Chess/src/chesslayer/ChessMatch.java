package chesslayer;

import boardgame.Board;
import boardgame.Position;
import chesslayer.chessPieces.Rook;

public class ChessMatch {
    private Board board;
    
    public ChessMatch(){
        board = new Board(8,8);
        initialSetup();
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] matriz = new ChessPiece[board.getRow()][board.getColumn()];
        for(int i = 0; i<board.getRow(); i++){
            for(int j = 0; j<board.getColumn(); j++){
                matriz[i][j] = (ChessPiece) board.piece(i,j);
            }
        }
        return matriz;
    }

    private void initialSetup() {
        board.placePiece(new Rook(board, Color.WHITE), new Position(7,0));
    }
}
