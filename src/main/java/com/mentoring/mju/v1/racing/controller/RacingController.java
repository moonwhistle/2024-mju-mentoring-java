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

        public void realRace()
        {
            outputView.carNames();
            inputView.carNames();
            Cars cars = new Cars(makeCars());
            outputView.chance();
            inputView.chance();
            outputView.guide();
            race(cars);

        }

        public List<Car> makeCars()
        {
            List<Car> carList = new ArrayList<>();
            for(String carName: inputView.getCarNames())
            {
                Car car = new Car(carName);
                carList.add(car);
            }
            return carList;
        }
        public void race(Cars cars)
        {
            List<Car> carList = cars.getCars();

            for(int i=0;i< inputView.getChance();i++)
            {
                outputView.moveCars(carList);
            }
        }



}
