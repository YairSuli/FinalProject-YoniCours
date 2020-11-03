package PageObjects.Grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {

    @FindBy(how = How.CSS, using = "div[class='text-center dashboard-header'] span")
    public WebElement txt_mainHeading;
}
