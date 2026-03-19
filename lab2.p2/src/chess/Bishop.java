package chess;

public class Bishop extends Piece {

    public Bishop(Position a, boolean white) {
        super(a, white);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (a.getX() == b.getX() && a.getY() == b.getY()) {
            return false;
        }

        int dx = Math.abs(a.getX() - b.getX());
        int dy = Math.abs(a.getY() - b.getY());

        return dx == dy;
    }
}