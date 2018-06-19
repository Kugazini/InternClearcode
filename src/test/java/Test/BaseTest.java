package Test;

import PageFactory.EnterWebsite;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;
    EnterWebsite enterWebsite;

    @Before
    public void setup(){
        String usr = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", usr + "\\tools\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        enterWebsite = new EnterWebsite(driver);

    }
    @Test
    public void enterWebsitePage() throws InterruptedException {
        enterWebsite.openTVschedule();
        enterWebsite.setSearchBox("Democracy");
        Assert.assertEquals(enterWebsite.getMovieTitle(), "Democracy Now!");

    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
