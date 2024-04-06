package com.mentoring.mju.v1.racing.domain;


import com.mentoring.mju.v1.racing.view.InputView;

import java.util.List;

public class Car {
    private int randomNumber; //랜덤값 변수 선언
    private String carName; //차 이름 받는 변수 선언
    public Car(String carName, int randomNumber) //생성자 선언
    {
        this.carName = carName;
        this.randomNumber=randomNumber;
    }


}
