package boardgame;

public class Board {
    private int rows, columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        if(rows < 1 || columns < 1){
            throw new BoardException("Invalid board size");
        }
        this.rows = rows;
        this.columns = columns;
        this.pieces = new Piece[rows][columns];
    }

    public Piece piece(int row, int column){
        if(!positionExists(row,column)){
            throw new BoardException("Invalid position");
        }
        return pieces[row][column];
    }

    public Piece piece(Position pos){
        if(!positionExists(pos)){
            throw new BoardException("Invalid position");
        }
        return pieces[pos.getRow()][pos.getColumn()];
    }

    public void placePiece(Piece piece, Position pos){
        if(thereIsAPiece(pos)){
            throw new BoardException("There is already a piece on position: ("+pos+")");
        }
        pieces[pos.getRow()][pos.getColumn()] = piece;
        piece.position = pos;
    }

    private boolean positionExists(int row, int col){
        return row >= 0 && row < this.rows && col >= 0 && col < this.columns;
    }

    public boolean positionExists(Position pos){
        return positionExists(pos.getRow(), pos.getColumn());
    }

    public boolean thereIsAPiece(Position pos){
        if(!positionExists(pos)){
            throw new BoardException("Invalid position");
        }
        return piece(pos) != null;
    }

    public int getRow() {return rows;}
    public int getColumn() {return columns;}
}
