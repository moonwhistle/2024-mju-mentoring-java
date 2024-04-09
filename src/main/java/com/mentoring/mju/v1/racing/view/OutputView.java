package com.mentoring.mju.v1.racing.view;


import com.mentoring.mju.v1.racing.domain.Car;
import com.mentoring.mju.v1.racing.domain.Cars;

import java.util.List;

public class OutputView {

    // TODO : 화면 출력 구현
    public void carNames()
    {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }
    public void chance()
    {
        System.out.println("시도할 회수는 몇회인가요?");
    }
    public void showRace(Car car)
    {
        car.moveCar();
        System.out.println(car.getCarName()+": "+"-".repeat(car.getMoveCount()));
    }
    public void guide()
    {
        System.out.println("\n실행결과");
    }

    public void moveCars(List<Car> cars)
    {
        for(Car car: cars)
        {
            showRace(car);
        }
        System.out.print("\n");
    }

    public void winners(List<String> winners)
    {
        String winner = String.join(",",winners);
        System.out.println(winner+"가 최종우승했습니다.");
    }


}
