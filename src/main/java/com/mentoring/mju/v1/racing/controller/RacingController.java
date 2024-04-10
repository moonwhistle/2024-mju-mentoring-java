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
            race(cars,chance);
            cars.selectMaxCount();
            cars.selectWinners();
            outputView.winners(cars.getWinners());
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
        public void race(Cars cars, int chance)
        {
            List<Car> carList = cars.getCars();

            for(int i=0;i< chance;i++)
            {
                outputView.moveCars(carList);
            }
        }



}
