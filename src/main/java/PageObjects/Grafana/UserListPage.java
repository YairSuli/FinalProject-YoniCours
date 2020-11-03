package PageObjects.Grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UserListPage {

    @FindBy(how = How.CSS, using = "input[ng-model='user.name']")
    public WebElement txt_name;

    @FindBy(how = How.CSS, using = "input[ng-model='user.email']")
    public WebElement txt_email;

    @FindBy(how = How.CSS, using = "input[ng-model='user.login']")
    public WebElement txt_login;

    @FindBy(how = How.CSS, using = "input[ng-model='user.password']")
    public WebElement txt_password;

    @FindBy(how = How.CSS, using = "button[ng-click='create()']")
    public WebElement btn_create;

    @FindBy(how = How.CSS, using = "button[ng-click='deleteUser(user)']")
    public WebElement btn_delete;

    @FindBy(how = How.CSS, using = "button[ng-show='onConfirm']")
    public WebElement btn_confirmDelete;
}
