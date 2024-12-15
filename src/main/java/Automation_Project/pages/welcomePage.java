package Automation_Project.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class welcomePage {
    @FindBy(partialLinkText = "NEWSLETTER")
    WebElement newsletterTab;

    @FindBy(partialLinkText = "ISRAEL NE")
    WebElement israelNewsTab;

    @FindBy(partialLinkText = "HEALTH")
    WebElement healthTab;

    @FindBy(partialLinkText = "WORLD")
    WebElement worldNewsTab;

    @FindBy(partialLinkText = "MIDDLE")
    WebElement middleEastTab;

    @FindBy(partialLinkText = "BUSINESS")
    WebElement businessTab;

    @FindBy(partialLinkText = "OPINION")
    WebElement opinionTab;

    @FindBy(partialLinkText = "STORE")
    WebElement storeTab;

    @FindBy(className = "search-wrap-link")
    WebElement searchIcon;


    private ChromeDriver driver;

    public welcomePage(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    List<String> allTabs = new ArrayList<>();
    public void printNamesOfTheNavigation(){
        System.out.println(newsletterTab.getText());
        allTabs.add(newsletterTab.getText());
        System.out.println(israelNewsTab.getText());
        allTabs.add(israelNewsTab.getText());
        System.out.println(healthTab.getText());
        allTabs.add(healthTab.getText());
        System.out.println(worldNewsTab.getText());
        allTabs.add(worldNewsTab.getText());
        System.out.println(middleEastTab.getText());
        allTabs.add(middleEastTab.getText());
        System.out.println(businessTab.getText());
        allTabs.add(businessTab.getText());
        System.out.println(opinionTab.getText());
        allTabs.add(opinionTab.getText());
        System.out.println(storeTab.getText());
        allTabs.add(storeTab.getText());
        System.out.println(allTabs);
    }

    public void isAllNavigationInTheWebsite(){
        List<String> expNavbar = Arrays.asList("JP NEWSLETTER", "ISRAEL NEWS", "HEALTH & WELLNESS", "WORLD NEWS", "MIDDLE EAST", "BUSINESS & INNOVATION", "OPINION", "JP STORE");
        for(int i=0; i<expNavbar.size(); i++){
            Assert.assertEquals("The test is fail!!! in nav " + i + " it's not in the website", expNavbar.get(i), allTabs.get(i));
        }
        System.out.println("the test is passed!! all navigation in the website!!!");
    }


    public String returnLinkOpinionTabName(){
        String linkName = opinionTab.getText();
        return linkName;
    }


    public void clickOnOpinionTab(){
        opinionTab.click();
    }

    public void clickOnSearchIcon(){
        searchIcon.click();
    }

    public void clickOnStoreTab(){
        storeTab.click();
    }


}
