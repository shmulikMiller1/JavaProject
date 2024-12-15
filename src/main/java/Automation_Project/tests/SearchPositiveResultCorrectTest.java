package Automation_Project.tests;

import Automation_Project.pages.searchPage;
import Automation_Project.pages.welcomePage;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchPositiveResultCorrectTest {
    public static void main(String[] args) {
        seleniumBase base = new seleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.jpost.com/");

        welcomePage welcomePageObject = new welcomePage(driver);
        searchPage searchPageObject = new searchPage(driver);

        welcomePageObject.clickOnSearchIcon();
        searchPageObject.isSearchResultCorrect("qualitest");

        base.seleniumClose(driver);
    }
}
