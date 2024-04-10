package com.mentoring.mju.v1.racing.view;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final Scanner input = new Scanner(System.in);

    public List<String> carNames()
    {
        List<String> carNames;
        String inputCarNames = input.nextLine();
        String[] carNamesArray = inputCarNames.split(",");
        carNames = Arrays.asList(carNamesArray);
        return carNames;
    }
    public int chance()
    {
        int chance;
        chance = input.nextInt();
        return chance;
    }




}
