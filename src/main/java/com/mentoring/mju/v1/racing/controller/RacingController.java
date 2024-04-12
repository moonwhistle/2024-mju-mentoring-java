package com.mentoring.mju.v1.racing.controller;

import com.mentoring.mju.v1.racing.domain.Car;
import com.mentoring.mju.v1.racing.domain.Cars;
import com.mentoring.mju.v1.racing.view.InputView;
import com.mentoring.mju.v1.racing.view.OutputView;
import java.util.List;

public class RacingController {

        private final InputView inputView = new InputView();
        private final OutputView outputView = new OutputView();

        public void startRace(){
            outputView.carNames();
            List<String> carNames = inputView.carNames();
            Cars cars = Cars.makeCars(carNames);
            List<Car> carList = cars.getCars();
            outputView.chance();
            int chance = inputView.getChance();
            outputView.guide();
            repeatRace(carList,chance);
            int maxCount = cars.selectMaxCount();
            List<String> winners = cars.selectWinners(maxCount);
            outputView.winners(winners);
        }

        private void startRace(List<Car> carList){
            for(Car car: carList){
                car.moveCar();
                outputView.showRace(car.getCarName(),car.getMoveCount());
            }
            outputView.newLine();
        }

        private void repeatRace(List<Car> carList,int chance){
            for(int i=0;i<chance;i++) {
                startRace(carList);
            }
        }

}
