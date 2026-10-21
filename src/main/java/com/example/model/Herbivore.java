package com.example.model;

public class Herbivore extends Creature {
    private double health;

    Herbivore(double x, double y, double speed, double health) {
        super(x, y, speed);
        this.health = health;
    }

    @Override
    public void makeMove(double x, double y) {
        System.out.println("Я походил на %s : %s".formatted(x, y));
    }

    public void eatGrass() {
        System.out.println("Я поел травы");
    }
}
