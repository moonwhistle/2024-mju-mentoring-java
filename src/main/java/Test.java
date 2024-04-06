import com.mentoring.mju.v1.racing.controller.RacingController;
import com.mentoring.mju.v1.racing.domain.Car;

public class Test {
    static String[] carData = {"oo","dd"};


    public static void main(String[] args) {
        Car car = new Car(carData[1]);
        RacingController racingController = new RacingController();
        racingController.complete();
    }



}
