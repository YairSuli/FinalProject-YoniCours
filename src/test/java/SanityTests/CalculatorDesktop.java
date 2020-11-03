package SanityTests;

import Extensions.Verifications;
import Utilities.CommonOps;
import WorkFlows.CalcFlow;
import WorkFlows.WebFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.Listeners.class)
public class CalculatorDesktop extends CommonOps {

    @Test(description = "Test01: Verify Addition Command")
    @Description("Test Description: Verify Addition Command in Calculator")
    public void test01_addition() {
        CalcFlow.calculateAddition();
        Verifications.textInElement(calcMain.btn_result, "8");
    }
}
