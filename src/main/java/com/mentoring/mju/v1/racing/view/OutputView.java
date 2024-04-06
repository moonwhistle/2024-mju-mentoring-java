package com.mentoring.mju.v1.racing.view;


import com.mentoring.mju.v1.racing.domain.Car;
import com.mentoring.mju.v1.racing.domain.Cars;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class OutputView {

    Cars cars;

    // TODO : 화면 출력 구현
    public void firstGuide() //첫 번째 안내 메세지
    {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }
    public void secondGuide()//두 번째 안내 메세지
    {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public void start() //실행 결과 메서드
    {
        System.out.println("실행 결과");
    }

    public void showName(Car car)
    {
        System.out.print(car.getCarName()+": ");
    }

    public void changeCountToChar(Car car) //자동차의 카운트를 '-'로 바꿔주는 함수 선언
    {
        int count = car.getMoveCount();
        String bar = "-".repeat(count);
        System.out.println(bar);

    }
    public void printWinner(List<Car> cars)
    {
        System.out.print("최종 우승자: ");
        List<String> winnerName = new ArrayList<>();
        for(Car car : cars)
        {
           winnerName.add(car.getCarName());
        }
        String Winner = winnerName.stream().map(Objects::toString).collect(Collectors.joining(","));
        System.out.println(Winner);
    }


}