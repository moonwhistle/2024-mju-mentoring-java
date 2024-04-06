package com.mentoring.mju.v1.racing.domain;

import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars(final List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars()
    {
        return cars;
    }
}
