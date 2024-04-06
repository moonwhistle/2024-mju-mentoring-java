package com.mentoring.mju.v1.racing.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {

    private static final Scanner input = new Scanner(System.in);

    private List<String> carNames; //차 이름을 담을 list 선언
    private int Chance; //몇 번 시도할 것인지 입력받는 변수 선언

    // Todo : 입력 받기
    public void inputCarNames() //carNames 입력받는 메서드
    {
        String inputCarNames = input.nextLine(); // 한 줄 입력받음
        String[] carNamesArray = inputCarNames.split(","); //입력받은 한 줄을 array에 쉼표로 구분해서 넣음
        for(String a: carNamesArray) //for each 문으로 배열 하나하나에 접근
        {
            if(a.length()>=6)
            {
                throw new IllegalArgumentException("[ERROR]"); //에러 메세지 출력
            }
        }
        carNames = Arrays.asList(carNamesArray);
    }

    public List<String> getCarNames() //carNames의 getter
    {
        return carNames;
    }

    public void inputChane() //Chance 입력받는 메서드
    {
        Chance = input.nextInt();
    }

    public int getChance() //Chance getter
    {
        return Chance;
    }


}
