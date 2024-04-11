package com.mentoring.mju.v1.racing.view;

import java.util.List;

public class OutputView {

    // TODO : 화면 출력 구현
    public void carNames(){
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }

    public void chance(){
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public void showRace(String carName, int moveCount){
        System.out.println(carName+": "+"-".repeat(moveCount));
    }

    public void guide(){
        System.out.println("\n실행결과");
    }

    public void winners(List<String> winners){
        String winner = String.join(",",winners);
        System.out.println(winner+"가 최종우승했습니다.");
    }

    public void newLine(){
        System.out.print("\n");
    }

}
