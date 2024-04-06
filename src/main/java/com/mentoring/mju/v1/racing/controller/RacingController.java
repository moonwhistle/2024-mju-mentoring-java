package com.mentoring.mju.v1.racing.controller;

import com.mentoring.mju.v1.racing.domain.Car;
import com.mentoring.mju.v1.racing.domain.Cars;
import com.mentoring.mju.v1.racing.view.InputView;
import com.mentoring.mju.v1.racing.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class RacingController {
    OutputView outputView = new OutputView();
    InputView inputView = new InputView();


    // 조립
   public void guide()
   {
       outputView.firstGuide();
       inputView.inputCarNames();
       outputView.secondGuide();
       inputView.inputChane();
       outputView.start();
   }

   public List<Car> makeCars() //여러 자동차 묶음 생성
   {
       List<Car> carList = new ArrayList<>();
       for(String carName: inputView.getCarNames())
       {
           Car car = new Car(carName);
           carList.add(car);
       }
       Cars cars = new Cars(carList);
       return cars.getCars();
   }

   public void realGame()
   {
       RacingController racingController = new RacingController();
       for(int i=0;i< inputView.getChance();i++)
       {
            for(Car car : racingController.makeCars())
            {
                car.moveCar(car);
            }
       }
   }







}
