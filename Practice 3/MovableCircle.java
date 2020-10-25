package com.company;

public class MovableCircle implements Movable{
    private final int radius;
    private final MovablePoint center;

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "x=" + center.x +
                ", y=" + center.y +
                ", xSpeed=" + center.xSpeed +
                ", ySpeed=" + center.ySpeed +
                "radius=" + radius +
                '}';
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
