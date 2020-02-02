package com.javarush.task.task23.task2312;

public class Mouse {
    private int x;
    private int y;

    private Mouse(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private int getX() {
        return x;
    }

    private int getY() {
        return y;
    }
}
