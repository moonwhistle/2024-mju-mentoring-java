package com.mentoring.mju.v1.racing.view;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final Scanner input = new Scanner(System.in);
    private List<String> carNames;
    private int Chance;
    public void carNames()
    {
        String inputCarNames = input.nextLine();
        String[] carNamesArray = inputCarNames.split(",");
        carNames = Arrays.asList(carNamesArray);
    }
    public void chance()
    {
        Chance = input.nextInt();
    }
    public List<String> getCarNames()
    {
        return carNames;
    }
    public int getChance()
    {
        return Chance;
    }


}
