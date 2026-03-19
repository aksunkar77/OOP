package app;

import chess.*;

public class MainApp {
    public static void main(String[] args) {

        Rook rook = new Rook(new Position(1, 1), true);
        Bishop bishop = new Bishop(new Position(2, 2), true);
        Queen queen = new Queen(new Position(4, 4), true);
        Knight knight = new Knight(new Position(3, 3), true);
        King king = new King(new Position(5, 5), true);
        Pawn pawn = new Pawn(new Position(6, 2), true);

        System.out.println("Rook move to (1,5): " + rook.isLegalMove(new Position(1, 5)));
        System.out.println("Bishop move to (5,5): " + bishop.isLegalMove(new Position(5, 5)));
        System.out.println("Queen move to (4,7): " + queen.isLegalMove(new Position(4, 7)));
        System.out.println("Knight move to (5,4): " + knight.isLegalMove(new Position(5, 4)));
        System.out.println("King move to (6,6): " + king.isLegalMove(new Position(6, 6)));
        System.out.println("Pawn move to (6,3): " + pawn.isLegalMove(new Position(6, 3)));

        System.out.println("Rook wrong move to (2,3): " + rook.isLegalMove(new Position(2, 3)));
        System.out.println("Knight wrong move to (4,4): " + knight.isLegalMove(new Position(4, 4)));
    }
}