package chess;

public class Rook extends Piece {

    public Rook(Position a, boolean white) {
        super(a, white);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (a.getX() == b.getX() && a.getY() == b.getY()) {
            return false;
        }

        return a.getX() == b.getX() || a.getY() == b.getY();
    }
}