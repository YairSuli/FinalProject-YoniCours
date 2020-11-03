package Utilities;

import org.openqa.selenium.support.PageFactory;

public class ManagePages extends Base {
    public static void init() {
        grafanaLogin = PageFactory.initElements(driver, PageObjects.Grafana.LoginPage.class);
        grafanaMain = PageFactory.initElements(driver, PageObjects.Grafana.MainPage.class);
        grafanaLeftMenu = PageFactory.initElements(driver, PageObjects.Grafana.LeftMenuPage.class);
        grafanaSeverAdminMenuPage = PageFactory.initElements(driver, PageObjects.Grafana.SeverAdminMenuPage.class);
        grafanaSeverAdminMainPage = PageFactory.initElements(driver, PageObjects.Grafana.ServerAdminMainPage.class);
        grafanaUserListPage = PageFactory.initElements(driver, PageObjects.Grafana.UserListPage.class);

        electronMain = PageFactory.initElements(driver, PageObjects.ElectronDemo.MainPage.class);
        calcMain = PageFactory.initElements(driver, PageObjects.Calculator.MainPage.class);
    }
}
