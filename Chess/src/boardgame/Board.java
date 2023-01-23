package boardgame;

public class Board {
    private int rows, columns;
    private Piece[][] pieces;

    public Board(int row, int column) {
        this.rows = row;
        this.columns = column;
        this.pieces = new Piece[rows][columns];
    }

    public Piece piece(int row, int column){
        return pieces[row][column];
    }

    public Piece piece(Position pos){
        return pieces[pos.getRow()][pos.getColumn()];
    }

    public void placePiece(Piece piece, Position pos){
        pieces[pos.getRow()][pos.getColumn()] = piece;
        piece.position = pos;
    }

    public int getRow() {return rows;}
    public void setRow(int row) {this.rows = row;}
    public int getColumn() {return columns;}
    public void setColumn(int column) {this.columns = column;}
}
