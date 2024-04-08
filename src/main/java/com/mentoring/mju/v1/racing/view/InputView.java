package com.mentoring.mju.v1.racing.view;
import java.util.Scanner;

public class InputView {
    private static final Scanner input = new Scanner(System.in);

    public void getCarNames()
    {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }

}
