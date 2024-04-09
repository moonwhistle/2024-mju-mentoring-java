package com.mentoring.mju.v1.racing.domain;



public class Car {

    private final int RANDOM_NUMBER = (int)(Math.random()*9);
    private final int BOUNDARY = 3;
    private String carName;
    private int moveCount;
    public Car(String carName)
    {
        this.carName = carName;
    }
    public int moveCar()
    {
        if(RANDOM_NUMBER>BOUNDARY)
        {
            moveCount++;
        }
        return moveCount;
    }
    public int getMoveCount()
    {
        return moveCount;
    }

}
