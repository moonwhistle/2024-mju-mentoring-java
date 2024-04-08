package com.mentoring.mju.v1.racing.controller;

import com.mentoring.mju.v1.racing.domain.Car;
import com.mentoring.mju.v1.racing.view.InputView;

import java.util.ArrayList;
import java.util.List;

public class RacingController {

        List<Car> carList;
        InputView inputView = new InputView();

        public List<Car> makeCars()
        {
            List<String> carNames = inputView.getCarNames();
            List<Car> carsArray = new ArrayList<>();
            for(String carName: carNames)
            {
                Car car = new Car(carName);
                carsArray.add(car);
            }
            carList = new ArrayList<>(carsArray);
            return carList;
        }

}
