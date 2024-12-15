package Automation_Project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class opinionPage {
    @FindBy(css = "div[class='page-header-info']")
    WebElement header;

    private ChromeDriver driver;

    public opinionPage(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String returnFirstTextFromHeader() throws InterruptedException {
        sleep(3000);
        int index = header.getText().indexOf("\n");
        String headerText = header.getText().substring(0,index);
        return headerText;
    }
}
