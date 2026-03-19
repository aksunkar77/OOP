
package chess;

public class King extends Piece {

    public King(Position a, boolean white) {
        super(a, white);
    }

    @Override
    public boolean isLegalMove(Position b) {
        int dx = Math.abs(a.getX() - b.getX());
        int dy = Math.abs(a.getY() - b.getY());

        return dx <= 1 && dy <= 1 && !(dx == 0 && dy == 0);
    }
}
