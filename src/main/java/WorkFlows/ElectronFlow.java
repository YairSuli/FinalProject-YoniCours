package WorkFlows;

import Extensions.UiActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;

public class ElectronFlow extends CommonOps {

    @Step("Get Screen Info (Resolution")
    public static void getScreenInfo() {
        UiActions.click(electronMain.btn_windows);
        UiActions.click(electronMain.btn_info);
        UiActions.click(electronMain.btn_demo_tuggle);
        UiActions.click(electronMain.btn_demo_tuggle);
        UiActions.click(electronMain.btn_screen_info);
    }
}
