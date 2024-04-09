package com.mentoring.mju.v1.racing.domain;

import java.util.List;

public class Cars {

    private final List<Car> cars;
    private List<String> winners;
    private int MAX_COUNT=0;

    public Cars(final List<Car> cars) {
        this.cars = cars;
    }

    public void selectMaxCount()
    {
        for(Car car: cars)
        {
            if(car.getMoveCount()>=MAX_COUNT)
            {
                MAX_COUNT = car.getMoveCount();
            }
        }
    }

    public void selectWinners()
    {
        for(Car car: cars)
        {
            if(car.getMoveCount() == MAX_COUNT)
            {
                winners.add(car.getCarName());
            }
        }
    }

    public List<Car> getCars()
    {
        return cars;
    }



}
