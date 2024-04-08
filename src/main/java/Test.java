import com.mentoring.mju.v1.racing.view.InputView;
import com.mentoring.mju.v1.racing.view.OutputView;

public class Test {

    public static void main(String[] args) {
        OutputView outputView = new OutputView();
        InputView inputView = new InputView();

        outputView.getCarNames();
        inputView.getCarNames();
        outputView.getChance();
        System.out.println(inputView.getChance());
    }

}
