package com.mentoring.mju.v1.racing.domain;

import java.util.ArrayList;
import java.util.LinkedList;
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

    public List<Car> selectWinner()
    {
        int count =0;
        for(Car car : cars)
        {
            if(car.getMoveCount()>=count)
            {
                count = car.getMoveCount();
            }
        }
        List<Car> winCar = new ArrayList<>();
        for(Car car : cars)
        {
            if(count == car.getMoveCount())
            {
                winCar.add(car);
            }
        }
        return winCar;
    }
}
