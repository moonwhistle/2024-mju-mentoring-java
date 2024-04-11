package com.mentoring.mju.v1.racing.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars(final List<Car> cars) {
        this.cars = cars;
    }

    public int selectMaxCount(){
        int maxCount = 0;
        for(Car car: cars){
            if(car.getMoveCount()>=maxCount){
                maxCount = car.getMoveCount();
            }
        }
        return maxCount;
    }

    public List<String> selectWinners(int maxCount){
        List<String> winners = new ArrayList<>();
        for(Car car: cars){
            if(car.getMoveCount() == maxCount){
                winners.add(car.getCarName());
            }
        }
        return winners;
    }

    public List<Car> getCars(){
        return cars;
    }

}
