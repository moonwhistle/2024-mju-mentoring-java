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
   public void complete()
   {
       outputView.firstGuide();
       inputView.inputCarNames();
       outputView.secondGuide();
       inputView.inputChane();
       outputView.start();

       List<Car> cars = makeCars();
       realGame(cars);
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

   public void realGame(List<Car> cars) //차들이 움직이는 메서드 구현(+count)
   {
       for(int i=0;i< inputView.getChance();i++)
       {
            for(Car car : cars)
            {
                car.moveCar(car);
            }
       }
   }









}
