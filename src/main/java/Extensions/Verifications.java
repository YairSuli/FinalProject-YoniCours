package Extensions;

import Utilities.CommonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class Verifications extends CommonOps {

    @Step("Verify Test in Element")
    public static void textInElement(WebElement elem, String expectedValue) {
        if (!Platform.equalsIgnoreCase("mobile") && !Platform.equalsIgnoreCase("electron") && !Platform.equalsIgnoreCase("desktop"))
            wait.until(ExpectedConditions.visibilityOf(elem));
        if (Platform.equalsIgnoreCase("desktop"))
            assertEquals(elem.getText().replaceAll("Display is", "").trim(), expectedValue);
        else
            assertEquals(elem.getText(), expectedValue);

    }

    @Step("Verify the Number of Elements Equals to")
    public static void numberOfElements(List<WebElement> elems, int expecteddValue) {
        wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size() - 1)));
        assertEquals(elems.size(), expecteddValue);
    }

    @Step("Verify Element Visually")
    public static void visualElement(WebElement imageElement, String expectedImageName) {
        BufferedImage expectedImage = null;
        try {
            expectedImage = ImageIO.read(new File(getData("ImageRepo") + expectedImageName + ".png"));
        } catch (Exception e) {
            System.out.println("Error reading image file: " + e);
        }
        Screenshot imageScreenshot = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver, imageElement);
        BufferedImage actualImage = imageScreenshot.getImage();
        diff = imgDiff.makeDiff(actualImage, expectedImage);
        Assert.assertFalse(diff.hasDiff(), "Images are not the same");
    }

    @Step("Verify Text with Text")
    public static void text(String actualText, String expectedText) {
        Assert.assertEquals(actualText, expectedText);
    }
}
