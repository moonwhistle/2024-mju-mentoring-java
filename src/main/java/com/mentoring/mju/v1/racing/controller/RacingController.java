package com.mentoring.mju.v1.racing.controller;

import com.mentoring.mju.v1.racing.domain.Car;
import com.mentoring.mju.v1.racing.domain.Cars;
import com.mentoring.mju.v1.racing.view.InputView;

import java.util.ArrayList;
import java.util.List;

public class RacingController {

        InputView inputView = new InputView();

        public List<Car> makeCars()
        {
            List<Car> carList = new ArrayList<>();
            for(String carName: inputView.getCarNames())
            {
                Car car = new Car(carName);
                carList.add(car);
            }
            return carList;
        }

}
