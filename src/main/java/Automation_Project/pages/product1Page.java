package Automation_Project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class product1Page {
    @FindBy(id = "add_item_btn")
    WebElement addButton;

    @FindBy(className = "count")
    WebElement countItems;

    @FindBy(className = "cart-price")
    WebElement priceCart;

    private ChromeDriver driver;

    public product1Page(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getSumOfCart() throws InterruptedException {
        addButton.click();
        sleep(3000);
        String sumCart = priceCart.getText();
        return sumCart;
    }
}
