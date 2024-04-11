package com.mentoring.mju.v1.racing.domain;

public class Car {

    private static final int BOUNDARY = 3;

    private final String carName;
    private int moveCount;

    public Car(String carName){
        this.carName = carName;
    }

    private int createRandomNumber(){
        return (int)(Math.random()*9);
    }

    public void moveCar(){
        if(createRandomNumber()>BOUNDARY)
        {
            moveCount++;
        }
    }

    public int getMoveCount(){
        return moveCount;
    }
    
    public String getCarName(){
        return carName;
    }


}
