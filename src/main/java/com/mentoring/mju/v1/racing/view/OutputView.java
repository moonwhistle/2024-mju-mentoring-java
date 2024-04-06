package com.mentoring.mju.v1.racing.view;





public class OutputView {

    InputView inputView;

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

}