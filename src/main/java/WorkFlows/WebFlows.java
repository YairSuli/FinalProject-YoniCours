package WorkFlows;

import Extensions.DbActions;
import Extensions.UiActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;

import java.util.List;

public class WebFlows extends CommonOps {

    @Step("Login Grafana Flow")
    public static void login(String user, String password) {
        UiActions.updateText(grafanaLogin.txt_userName, user);
        UiActions.updateText(grafanaLogin.txt_password, password);
        UiActions.click(grafanaLogin.btn_login);
        UiActions.click(grafanaLogin.btn_skip);
    }

    @Step("Login Grafana Flow with DB Credentials")
    public static void loginDB() {

//        DbActions.getCredentials("SELECT user_name,password FROM Credentials WHERE id='3'");
        List<String> cred = DbActions.getCredentials("SELECT user_name,password FROM Credentials WHERE id='3'");
        UiActions.updateText(grafanaLogin.txt_userName, cred.get(0));
        UiActions.updateText(grafanaLogin.txt_password, cred.get(1));
        UiActions.click(grafanaLogin.btn_login);
        UiActions.click(grafanaLogin.btn_skip);
    }

    @Step("Create a New User")
    public static void createUser(String name, String email, String user, String pass) {
        UiActions.click(grafanaSeverAdminMainPage.btn_newUser);
        UiActions.updateText(grafanaUserListPage.txt_name, name);
        UiActions.updateText(grafanaUserListPage.txt_email, email);
        UiActions.updateText(grafanaUserListPage.txt_login, user);
        UiActions.updateText(grafanaUserListPage.txt_password, pass);
        UiActions.click(grafanaUserListPage.btn_create);
    }

    @Step("Delete Last User from Users Table")
    public static void deleteLastUser() {
        UiActions.click(grafanaSeverAdminMainPage.rows.get(grafanaSeverAdminMainPage.rows.size() - 1));
        UiActions.click(grafanaUserListPage.btn_delete);
        UiActions.click(grafanaUserListPage.btn_confirmDelete);
    }
}
