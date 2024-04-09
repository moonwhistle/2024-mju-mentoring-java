package com.mentoring.mju.v1.racing.domain;


import java.security.PublicKey;

public class Car {

    private final int BOUNDARY = 3;
    private String carName;
    private int moveCount;

    public int createRandomNumber()
    {
        return (int)(Math.random()*9);
    }
    public Car(String carName)
    {
        this.carName = carName;
    }
    public void moveCar()
    {
        if(createRandomNumber()>BOUNDARY)
        {
            moveCount++;
        }
    }
    public int getMoveCount()
    {
        return moveCount;
    }
    public String getCarName()
    {
        return carName;
    }


}
