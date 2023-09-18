package seleniumour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class LocatorsSeleniumStartPhonebook {

    WebDriver driver;

    @Test
    public void test1(){
        driver = new ChromeDriver();
        driver.navigate().to("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        WebElement h1TextElement = driver.findElement(By.cssSelector("h1"));
        System.out.println(h1TextElement.getText());

        WebElement h1ByTagName = driver.findElement(By.tagName("h1"));
        System.out.println(h1ByTagName.getText());

        WebElement aTextElementByClassName = driver.findElement(By.className("active"));
        System.out.println(aTextElementByClassName.getText());

        WebElement aByClassAndTagTogether = driver.findElement(By.cssSelector("a.active"));
        System.out.println(aByClassAndTagTogether.getText());

        WebElement inputRootById = driver.findElement(By.cssSelector("#root"));
        System.out.println(inputRootById.getAttribute("type"));

        WebElement inputRootByIdDirectly = driver.findElement(By.id("root")); //by id value
        System.out.println(inputRootByIdDirectly.getAttribute("type"));

        WebElement wildElementAttribute =
                driver.findElement(By.cssSelector("[style='border: 1px solid black; background-color: black; color: white;"));

        WebElement aByText = driver.findElement(By.partialLinkText("HOME"));


        WebElement xpathLabel = driver.findElement(By.xpath("//a[@href='/home']"));
        System.out.println(xpathLabel.getText());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }

        driver.quit();
    }

}
