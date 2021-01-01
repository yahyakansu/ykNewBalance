package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//*[@id=\"cdev-email-lightbox-0115\"]/button")
    public WebElement popUp;

    @FindBy(id = "top-nav-search")
    public WebElement search;

    @FindBy(xpath = "//img[@alt='running']")
    public WebElement runningShoes;
}

