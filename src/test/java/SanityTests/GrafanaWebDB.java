package SanityTests;

import Extensions.Verifications;
import Utilities.CommonOps;
import WorkFlows.WebFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.Listeners.class)
public class GrafanaWebDB extends CommonOps {

    @Test(description = "Test01: Login to Grafana")
    @Description("Test Description: Login to Grafana web application")
    public void test01_login() {
        WebFlows.loginDB();
        Verifications.textInElement(grafanaMain.txt_mainHeading, "Home Dashboard");
    }
}
