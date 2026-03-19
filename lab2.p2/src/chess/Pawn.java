package chess;

public class Pawn extends Piece {

    public Pawn(Position a, boolean white) {
        super(a, white);
    }

    @Override
    public boolean isLegalMove(Position b) {
        int dx = b.getX() - a.getX();
        int dy = b.getY() - a.getY();

        if (white) {
            return dx == 0 && dy == 1;
        } else {
            return dx == 0 && dy == -1;
        }
    }
}
