package com.mentoring.mju.v1.racing.domain;
import com.mentoring.mju.v1.racing.controller.RacingController;

import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars(final List<Car> cars) {
        this.cars = cars;
    }
    public void moveCars()
    {
        for(Car car: cars)
        {
            car.moveCar();
        }
    }


}
