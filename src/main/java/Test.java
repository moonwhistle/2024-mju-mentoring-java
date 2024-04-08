import com.mentoring.mju.v1.racing.controller.RacingController;
import com.mentoring.mju.v1.racing.domain.Car;
import com.mentoring.mju.v1.racing.domain.Cars;
import com.mentoring.mju.v1.racing.view.InputView;
import com.mentoring.mju.v1.racing.view.OutputView;

public class Test {

    public static void main(String[] args) {
        OutputView outputView = new OutputView();
        InputView inputView = new InputView();
        RacingController racingController = new RacingController();
        Car aa = new Car("aa");

        outputView.getCarNames();
        inputView.getCarNames();
        outputView.getChance();
        System.out.println(inputView.getChance());
        System.out.println(aa.moveCar());

    }

}
