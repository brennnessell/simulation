package com.example.model;

public abstract class Creature extends Entity {
    protected double speed;

    Creature(double x, double y, double speed) {
        super(x, y);
        this.speed = speed;
    }
    protected void makeMove(double X, double Y) {
        //
    }
}
