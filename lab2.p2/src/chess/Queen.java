package chess;

public class Queen extends Piece {

    public Queen(Position a, boolean white) {
        super(a, white);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (a.getX() == b.getX() && a.getY() == b.getY()) {
            return false;
        }

        int dx = Math.abs(a.getX() - b.getX());
        int dy = Math.abs(a.getY() - b.getY());

        if (a.getX() == b.getX() || a.getY() == b.getY()) {
            return true;
        }

        return dx == dy;
    }
}
