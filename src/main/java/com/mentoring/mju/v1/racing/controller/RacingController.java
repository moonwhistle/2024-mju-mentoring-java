package com.mentoring.mju.v1.racing.controller;

import com.mentoring.mju.v1.racing.domain.Car;
import com.mentoring.mju.v1.racing.domain.Cars;
import com.mentoring.mju.v1.racing.view.InputView;
import com.mentoring.mju.v1.racing.view.OutputView;

import java.util.ArrayList;
import java.util.List;


public class RacingController {

        private final InputView inputView = new InputView();
        private final OutputView outputView = new OutputView();

        public void startRace()
        {
            outputView.carNames();
            List<String> carNames = inputView.carNames();
            Cars cars = new Cars(makeCars(carNames));
            outputView.chance();
            int chance = inputView.chance();
            outputView.guide();
            repeatRace(cars,chance);
            int maxCount = cars.selectMaxCount();
            List<String> winners = cars.selectWinners(maxCount);
            outputView.winners(winners);
        }

        public List<Car> makeCars(List<String> carNames)
        {
            List<Car> carList = new ArrayList<>();
            for(String carName: carNames)
            {
                Car car = new Car(carName);
                carList.add(car);
            }
            return carList;
        }
        public void race(Cars cars)
        {
            List<Car> carList = cars.getCars();
            for(Car car: carList)
            {
                car.moveCar();
                outputView.showRace(car.getCarName(),car.getMoveCount());
            }
            outputView.newLine();
        }

        public void repeatRace(Cars cars,int chance)
        {
            for(int i=0;i<chance;i++)
            {
                race(cars);
            }
        }



}
