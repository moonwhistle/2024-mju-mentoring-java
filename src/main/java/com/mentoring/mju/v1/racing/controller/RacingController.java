package com.mentoring.mju.v1.racing.controller;

import com.mentoring.mju.v1.racing.view.InputView;
import com.mentoring.mju.v1.racing.view.OutputView;

public class RacingController {

    // 조립
   public void guide()
   {
       OutputView outputView = new OutputView();
       outputView.firstGuide();
       InputView inputView = new InputView();
       inputView.inputCarNames();
       System.out.println(inputView.getCarNames());
       outputView.secondGuide();
   }
}
