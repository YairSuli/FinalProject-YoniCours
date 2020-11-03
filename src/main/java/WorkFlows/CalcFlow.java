package WorkFlows;

import Extensions.UiActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;

public class CalcFlow extends CommonOps {

    @Step("Calculate Addition")
    public static void calculateAddition() {
        UiActions.click(calcMain.btn_clear);
        UiActions.click(calcMain.btn_one);
        UiActions.click(calcMain.btn_plus);
        UiActions.click(calcMain.btn_seven);
        UiActions.click(calcMain.btn_equals);
    }
}
