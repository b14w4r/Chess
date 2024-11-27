package org.example.chess_pieces;

import org.example.ChessBoard;

public abstract class ChessPiece {
    protected String color;
    protected boolean check;

    // Конструктор, принимающий в себя строковую переменную color
    public ChessPiece(String color) {
        this.color = color;
        this.check = true;  // По умолчанию true
    }

    // Метод, возвращающий цвет фигуры
    public String getColor() {
        return color;
    }

    // Абстрактный метод, проверяющий возможность перемещения фигуры
    public abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);

    // Абстрактный метод, возвращающий тип фигуры
    public abstract String getSymbol();

    public void setCheck(boolean check) {
        this.check = check;
    }

    public boolean isCheck() {
        return check;
    }
}