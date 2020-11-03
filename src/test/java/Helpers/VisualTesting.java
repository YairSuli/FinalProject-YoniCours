package Helpers;

import Utilities.CommonOps;
import Utilities.HelperMethods;
import WorkFlows.WebFlows;
import org.testng.annotations.Test;


public class VisualTesting extends CommonOps {

    @Test
    public void createScreenshot() {
        WebFlows.login("admin", "admin");
        HelperMethods.takeElementScreenshot(grafanaLeftMenu.img_Avatar, "grafanaAvatar");
    }
}
