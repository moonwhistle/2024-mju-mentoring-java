package com.mentoring.mju.v1.racing.controller;

import com.mentoring.mju.v1.racing.view.InputView;

import java.util.List;


public class RacingController {

        InputView inputView = new InputView();

        public List<String> getCarNames()
        {
            return inputView.getCarNames();
        }


}
