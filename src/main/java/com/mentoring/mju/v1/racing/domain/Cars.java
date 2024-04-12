package com.mentoring.mju.v1.racing.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private final List<Car> cars;

    public Cars(final List<Car> cars) {
        this.cars = cars;
    }

    public int selectMaxCount(){
        return cars.stream()
                .mapToInt(Car::getMoveCount)
                .max()
                .orElse(0);
    }

    public List<String> selectWinners(int maxCount){
        return cars.stream()
                .filter(winner -> winner.getMoveCount() == maxCount)
                .map(Car::getCarName)
                .collect(Collectors.toList());
    }

    public List<Car> getCars(){
        return new ArrayList<>(cars);
    }

    public static Cars makeCars(List<String> carNames){
        List<Car> carList = new ArrayList<>();
        for(String carName: carNames){
            Car car = new Car(carName);
            carList.add(car);
        }
        return new Cars(carList);
    }

}
