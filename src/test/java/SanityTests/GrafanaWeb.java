package SanityTests;

import Extensions.UiActions;
import Extensions.Verifications;
import Utilities.CommonOps;
import WorkFlows.WebFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.Listeners.class)
public class GrafanaWeb extends CommonOps {

    @Test(description = "Test01: Login to Grafana")
    @Description("Test Description: Login to Grafana web application")
    public void test01_login() {
        WebFlows.login(getData("user"), getData("password"));
        Verifications.textInElement(grafanaMain.txt_mainHeading, "Home Dashboard");
    }

    @Test(description = "Test02: Verify Default Users")
    @Description("Test Description: Verifies the Default Number of Users (Should be 1)")
    public void test02_verifyDefaultUsers() {
        UiActions.mouseHoverElement(grafanaLeftMenu.btn_ServerAdmin, grafanaSeverAdminMenuPage.link_users);
        Verifications.numberOfElements(grafanaSeverAdminMainPage.rows, 1);
    }

    @Test(description = "Test03: Add and Verify Users")
    @Description("Test Description: Add a New User and Verifies the Number of Users is 2")
    public void test03_addAngVerifyUsers() {
        UiActions.mouseHoverElement(grafanaLeftMenu.btn_ServerAdmin, grafanaSeverAdminMenuPage.link_users);
        WebFlows.createUser("yoni", "yoni@gmail.com", "yonif", "12345");
        Verifications.numberOfElements(grafanaSeverAdminMainPage.rows, 2);
    }

    @Test(description = "Test04: Delete Last User and Verify Users")
    @Description("Test Description: Delete Last User and Verifies the Number of Users is 1")
    public void test04_deleteAngVerifyUsers() {
        UiActions.mouseHoverElement(grafanaLeftMenu.btn_ServerAdmin, grafanaSeverAdminMenuPage.link_users);
        WebFlows.deleteLastUser();
        Verifications.numberOfElements(grafanaSeverAdminMainPage.rows, 1);
    }

    @Test(description = "Test05: Verify Avatar")
    @Description("Test Description: Verify Garafana's default (admin) avatar")
    public void test05_verifyAvatar() {
        Verifications.visualElement(grafanaLeftMenu.img_Avatar, "grafanaAvatar");
    }
}
