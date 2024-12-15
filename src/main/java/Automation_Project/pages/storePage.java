package Automation_Project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class storePage {
    @FindBy(className = "thb-carousel-image-link")
    WebElement firstItem;

    @FindBy(className = "text-font-18")
    WebElement firstPrice;

    private ChromeDriver driver;

    public storePage(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getPriceOfFirstItem(){
        String priceItem = firstPrice.getText();
        int len = priceItem.length();
        priceItem = priceItem.substring(0, len-1);
        return priceItem;
    }

    public void clickOnFirstItem(){
        firstItem.click();
    }

}
