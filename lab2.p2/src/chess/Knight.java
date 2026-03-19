package chess;

public class Knight extends Piece {

    public Knight(Position a, boolean white) {
        super(a, white);
    }

    @Override
    public boolean isLegalMove(Position b) {
        int dx = Math.abs(a.getX() - b.getX());
        int dy = Math.abs(a.getY() - b.getY());

        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
    }
}
