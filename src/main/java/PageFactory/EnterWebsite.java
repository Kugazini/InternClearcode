package PageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterWebsite {

    WebDriver driver;

    @FindBy(xpath = "/html/body/div/section/input")
    WebElement searchBox;

    @FindBy(xpath = "/html/body/div/section/div[83]/a/div[1]")
    WebElement movieTitle;

    public EnterWebsite(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //url website
    public void openTVschedule(){
        driver.get("https://clearcodehq.github.io/qa-intern-test/#/home");
    }

    public void setSearchBox(String strTitle) {
        searchBox.sendKeys(strTitle);
        searchBox.sendKeys(Keys.ENTER);
    }

    public String getMovieTitle(){
        return movieTitle.getText();
    }


}
