package com.company;

public class MovableRectangle implements Movable {
    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;
    private static class SpeedException extends Exception {
        @Override
        public String getMessage() {
            return "Speeds of topLeft and bottomRight points are not equal!\n" +
                    "Try to find out how one of point's speed was changed.";
        }
    }

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    private boolean speedEqual() {
        return topLeft.xSpeed == bottomRight.xSpeed &&
                topLeft.ySpeed == bottomRight.ySpeed;
    }

    @Override
    public void moveUp() {
        try {
            if (!speedEqual()) {
                throw new SpeedException();
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        try {
            if (!speedEqual()) {
                throw new SpeedException();
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        try {
            if (!speedEqual()) {
                throw new SpeedException();
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        try {
            if (!speedEqual()) {
                throw new SpeedException();
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
