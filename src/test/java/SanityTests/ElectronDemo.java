package SanityTests;

import Extensions.Verifications;
import Utilities.CommonOps;
import WorkFlows.ElectronFlow;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.Listeners.class)
public class ElectronDemo extends CommonOps {

    @Test(description = "Test01: Verify Screen Resolution")
    @Description("Test Description: Getting the Resolution from App and verify it")
    public void test01_login() {
        ElectronFlow.getScreenInfo();
        Verifications.textInElement(electronMain.field_screen_info, "Your screen is: 1920px x 1080px");
    }
}
