package com.mentoring.mju.v1.racing.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars;
    private List<String> winners = new ArrayList<>();
    private int maxCount=0;

    public Cars(final List<Car> cars) {
        this.cars = cars;
    }

    public void selectMaxCount()
    {
        for(Car car: cars)
        {
            if(car.getMoveCount()>=maxCount)
            {
                maxCount = car.getMoveCount();
            }
        }
    }

    public void selectWinners()
    {
        for(Car car: cars)
        {
            if(car.getMoveCount() == maxCount)
            {
                winners.add(car.getCarName());
            }
        }
    }

    public List<Car> getCars()
    {
        return cars;
    }

    public List<String> getWinners()
    {
        return winners;
    }


}
