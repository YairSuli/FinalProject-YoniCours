package Utilities;

import org.openqa.selenium.WebElement;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;

import javax.imageio.ImageIO;
import java.io.File;

public class HelperMethods extends CommonOps {
    public static void takeElementScreenshot(WebElement imageElement, String imageName) {
//        imageScreenshot = new AShot().takeScreenshot(driver,imageElement); // win 7
        imageScreenshot = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver, imageElement); // win 10
        try {
            ImageIO.write(imageScreenshot.getImage(), "png", new File(getData("ImageRepo") + imageName + ".png"));
        } catch (Exception e) {
            System.out.println("Error writing image image file, see details: " + e);
        }
    }


}
