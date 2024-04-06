package com.mentoring.mju.v1.racing.domain;


import com.mentoring.mju.v1.racing.view.InputView;

import java.util.List;

public class Car {
    private int randomNumber; //랜덤값 변수 선언
    private String carName; //차 이름 받는 변수 선언
    private int moveCount =0 ;
    public Car(String carName, int moveCount) //생성자 선언
    {
        this.carName = carName;
        this.moveCount = moveCount;
    }

    public void moveCar(Car car) //랜덤 값에 따라 차가 움직이는 함수 선언
    {
        randomNumber = (int)(Math.random()*10);
        if(randomNumber>=4)
        {
            car.moveCount++;
        }
    }




}
