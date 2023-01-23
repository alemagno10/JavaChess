package chesslayer;

import boardgame.Position;

public class ChessPosition {
    private char col;
    private int row;

    public ChessPosition(char col, int row) {
        if(col<'a' || col>'h' || row<1 || row>8){
            throw new ChessException("Invalid position");
        }
        this.col = col;
        this.row = row;
    }

    protected Position toPosition(){
        return new Position(8-row, col-'a');
    }

    protected static ChessPosition fromPosition(Position pos){
        return new ChessPosition((char)('a'-pos.getColumn()), 8 - pos.getRow());
    }

    @Override
    public String toString(){
        return ""+col+row;
    }

    public char getCol() {return col;}
    public int getRow() {return row;}
}
