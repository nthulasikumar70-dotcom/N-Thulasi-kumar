// Chess Game using OOP Concepts

abstract class ChessPiece {
    private String color;

    // Encapsulation
    public ChessPiece(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // Polymorphism
    abstract void move();
}

// Inheritance
class King extends ChessPiece {
    public King(String color) {
        super(color);
    }

    public void move() {
        System.out.println(getColor() + " King moves one square.");
    }
}

class Queen extends ChessPiece {
    public Queen(String color) {
        super(color);
    }

    public void move() {
        System.out.println(getColor() + " Queen moves in any direction.");
    }
}

class Rook extends ChessPiece {
    public Rook(String color) {
        super(color);
    }

    public void move() {
        System.out.println(getColor() + " Rook moves horizontally or vertically.");
    }
}

class Bishop extends ChessPiece {
    public Bishop(String color) {
        super(color);
    }

    public void move() {
        System.out.println(getColor() + " Bishop moves diagonally.");
    }
}

class Knight extends ChessPiece {
    public Knight(String color) {
        super(color);
    }

    public void move() {
        System.out.println(getColor() + " Knight moves in L-shape.");
    }
}

class Pawn extends ChessPiece {
    public Pawn(String color) {
        super(color);
    }

    public void move() {
        System.out.println(getColor() + " Pawn moves forward one square.");
    }
}

public class ChessGame {

    public static void main(String[] args) {

        // Polymorphism
        ChessPiece[] pieces = {
            new King("White"),
            new Queen("White"),
            new Rook("Black"),
            new Bishop("Black"),
            new Knight("White"),
            new Pawn("Black")
        };

        System.out.println("Chess Game");

        for (ChessPiece piece : pieces) {
            piece.move();
        }
    }
}
