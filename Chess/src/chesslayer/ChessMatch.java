package chesslayer;

import boardgame.Board;
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

    private void placeNewPiece(ChessPiece piece,char col, int row){
        board.placePiece(piece, new ChessPosition(col, row).toPosition());
    }

    private void initialSetup() {
        placeNewPiece(new Rook(board, Color.WHITE), 'b',6);
        placeNewPiece(new Rook(board, Color.WHITE), 'd',6);
    }
}
