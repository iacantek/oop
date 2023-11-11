package ch.hslu.oop.sw04;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(1, 2), new Point(3, 4));

        line.getPoint1().setX(2);

        System.out.println(line.getPoint1().getX());
    }
}