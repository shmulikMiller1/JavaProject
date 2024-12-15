package Automation_Project.pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Objects;

public class searchPage {
    @FindBy(id = "gsc-i-id1")
    WebElement searchCase;

    @FindBy(className = "gs-title")
    WebElement firstResult;

    @FindBy(css = ".gs-bidi-start-align.gs-snippet")
    WebElement description;

    @FindBy(className = "gs-snippet")
    WebElement noResult;

    private ChromeDriver driver;

    public searchPage(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void isSearchResultCorrect(String word){
        searchCase.sendKeys(word);
        searchCase.sendKeys(Keys.ENTER);
        String textFirstResult = firstResult.getText().toLowerCase();
        String textDescription = description.getText().toLowerCase();
        boolean isFound = textFirstResult.contains(word) || textDescription.contains(word);
        Assert.assertTrue("the test is failed!! " + word + " isn't in the first result", isFound);
        System.out.println("the test is passed!! " + word + " is in the first result..");
    }

    public void isNegativeSearchResultCorrect(String word){
        searchCase.sendKeys(word);
        searchCase.sendKeys(Keys.ENTER);
        if(Objects.equals(noResult.getText(), "No Results")){
            System.out.println("please write a valid word");
        }
        else {
            String textFirstResult = firstResult.getText().toLowerCase();
            String textDescription = description.getText().toLowerCase();
            boolean isFound = textFirstResult.contains(word) || textDescription.contains(word);
            Assert.assertTrue("the test is failed! " + word + " isn't in the first result", isFound);
            System.out.println("the test is passed!! " + word + " is in the first result..");
        }

    }

}
