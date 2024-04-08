package com.mentoring.mju.v1.racing.domain;

import java.util.Random;

public class Car {

    private final int RANDOM_NUMBER = (int)(Math.random()*9);
    private String carName;
    private int moveCount;
    public Car(String carName)
    {
        this.carName = carName;
    }
    public int moveCar(Car car,int RANDOM_NUMBER)
    {
        car.moveCount++;
        return moveCount;
    }
}
