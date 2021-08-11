package com.codegym;

public class Main {

    public static void main(String[] args) {
        Point point = new Point(2,3);
        System.out.println(point);

        MovePoint movePoint = new MovePoint(2,3,1,1);
        System.out.println(movePoint);
        movePoint.move();
        System.out.println(movePoint);
    }
}
