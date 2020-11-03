package Utilities;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Base {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions action;
    public static Screenshot imageScreenshot;
    public static ImageDiffer imgDiff = new ImageDiffer();
    public static ImageDiff diff;
    public static DesiredCapabilities dc = new DesiredCapabilities();
    public static String Platform;

    public static PageObjects.Grafana.LoginPage grafanaLogin;
    public static PageObjects.Grafana.MainPage grafanaMain;
    public static PageObjects.Grafana.LeftMenuPage grafanaLeftMenu;
    public static PageObjects.Grafana.SeverAdminMenuPage grafanaSeverAdminMenuPage;
    public static PageObjects.Grafana.ServerAdminMainPage grafanaSeverAdminMainPage;
    public static PageObjects.Grafana.UserListPage grafanaUserListPage;

    public static PageObjects.ElectronDemo.MainPage electronMain;
    public static PageObjects.Calculator.MainPage calcMain;

    public static RequestSpecification httpRequest;
    public static Response response;
    public static JSONObject requestParams  = new JSONObject();
    public static JsonPath jp;

    public static Connection con;
    public static Statement stmt;
    public static ResultSet rs;
}
