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
   public void race()
   {
       outputView.firstGuide();
       inputView.inputCarNames();
       outputView.secondGuide();
       inputView.inputChane();
       outputView.start();

       List<Car> cars = makeCars();
       realmoveCar(cars);
       List<Car> Winner = selectWinner(cars);
       outputView.printWinner(Winner);
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

   public void realmoveCar(List<Car> cars) //차들이 움직이는 메서드 구현(+count)
   {   for(int i=0; i< inputView.getChance();i++)
       {
           for(Car car : cars)
           {
               car.moveCar(car);
               outputView.showName(car);
               outputView.changeCountToChar(car);
           }
           System.out.println();
       }
   }


    public List<Car> selectWinner(List<Car> cars) //승자 뽑는 메서드
    {
        int count =0;
        for(Car car : cars)
        {
            if(car.getMoveCount()>=count)
            {
                count = car.getMoveCount();
            }
        }
        List<Car> winCar = new ArrayList<>();
        for(Car car : cars)
        {
            if(count == car.getMoveCount())
            {
                winCar.add(car);
            }
        }
        return winCar;
    }


}
