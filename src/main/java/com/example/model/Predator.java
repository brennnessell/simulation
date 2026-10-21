package com.example.model;

public class Predator extends Creature {
    private double attackPower;
    Predator(double x, double y, double speed, double attackPower) {
        super(x, y, speed);
        this.attackPower = attackPower;
    }

    @Override
    public void makeMove(double x, double y) {
        System.out.println("Я походил на %s : %s".formatted(x, y));
    }

    public void attack() {
        System.out.println("Я атаковал!");
    }
}
