package com.mentoring.mju.v1.racing.controller;

import com.mentoring.mju.v1.racing.domain.Car;
import com.mentoring.mju.v1.racing.domain.Cars;
import com.mentoring.mju.v1.racing.view.InputView;
import com.mentoring.mju.v1.racing.view.OutputView;

import java.util.List;

public class RacingController {
    OutputView outputView;
    InputView inputView;

    // 조립
   public void guide()
   {
       outputView.firstGuide();
       inputView.inputCarNames();
       outputView.secondGuide();
       inputView.inputChane();
   }


}
