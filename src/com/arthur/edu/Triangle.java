package com.arthur.edu;

public class Triangle {

    private final Point point1;
    private final Point point2;
    private final Point point3;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.point1 = new Point(x1, y1);
        this.point2 = new Point(x2, y2);
        this.point3 = new Point(x3, y3);
    }

    public double getPerimeter() {
        double p1_p2 = Math.sqrt((Math.pow(point1.x - point2.x, 2) + Math.pow(point1.y - point2.y, 2)));
        double p2_p3 = Math.sqrt((Math.pow(point2.x - point3.x, 2) + Math.pow(point2.y - point3.y, 2)));
        double p1_p3 = Math.sqrt((Math.pow(point1.x - point3.x, 2) + Math.pow(point1.y - point3.y, 2)));

        return p1_p2 + p2_p3 + p1_p3;
    }

    private static class Point {
        private int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}
