package com.mentoring.mju.v1.racing.domain;


import com.mentoring.mju.v1.racing.view.InputView;

import java.util.List;

public class Car {
    private String carName; //차 이름 받는 변수 선언
    private int moveCount;
    public Car(String carName) //생성자 선언, carName받고, moveCount 초기 값은 0
    {
        this.carName = carName;
    }

    public void moveCar(Car car) //랜덤 값에 따라 차가 움직이는 함수 선언
    {
        //랜덤값 변수 선언
        int randomNumber = (int) (Math.random() * 10); //0~9 사이 랜덤값 생성
        if(randomNumber >=4)
        {
            car.moveCount++;
        }
    }





}
