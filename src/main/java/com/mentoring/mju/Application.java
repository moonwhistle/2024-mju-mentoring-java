package com.mentoring.mju;

import com.mentoring.mju.v1.racing.controller.RacingController;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        RacingController racingController = new RacingController();
        racingController.startRace();
    }

}
