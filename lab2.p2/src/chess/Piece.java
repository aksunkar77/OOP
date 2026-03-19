package chess;

public abstract class Piece {
    protected Position a;
    protected boolean white;

    public Piece(Position a, boolean white) {
        this.a = a;
        this.white = white;
    }

    public Position getPosition() {
        return a;
    }

    public void setPosition(Position a) {
        this.a = a;
    }

    public boolean isWhite() {
        return white;
    }

    public abstract boolean isLegalMove(Position b);
}