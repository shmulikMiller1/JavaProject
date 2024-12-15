package Automation_Project.tests;

import Automation_Project.pages.opinionPage;
import Automation_Project.pages.welcomePage;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;


public class linkNameDisplayedInHeaderTest {
    public static void main(String[] args) throws InterruptedException {
        seleniumBase base = new seleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.jpost.com/");

        welcomePage welcomePageObject = new welcomePage(driver);
        opinionPage opinionPageObject = new opinionPage(driver);

        String welcomePageLink = welcomePageObject.returnLinkOpinionTabName();
        welcomePageObject.clickOnOpinionTab();
        String opinionPageHeader = opinionPageObject.returnFirstTextFromHeader();
        Assert.assertEquals("the test is failed because " + welcomePageLink + " doesn't match to " + opinionPageHeader, welcomePageLink, opinionPageHeader);
        System.out.println("the test is passed!! link OPINION is displayed in header!!");

        base.seleniumClose(driver);

    }
}
