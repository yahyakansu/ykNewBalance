package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KidsPage {
    public KidsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@title='Shoes']")
    public WebElement type;

    @FindBy(xpath = "//button[@title='8']")
    public WebElement size;

    @FindBy(xpath = "//button[@title='Yellow']/span")
    public WebElement color;

    @FindBy(xpath = "//a[@title='Hook and Loop FuelCore Urge']")
    public WebElement yellowShoe;

    @FindBy(css = ".product-pricing")
    public WebElement price;
}
