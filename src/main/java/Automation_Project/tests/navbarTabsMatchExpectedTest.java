package Automation_Project.tests;

import Automation_Project.pages.welcomePage;
import org.openqa.selenium.chrome.ChromeDriver;

public class navbarTabsMatchExpectedTest {
    public static void main(String[] args) {
        seleniumBase base = new seleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.jpost.com/");

        welcomePage welcomePageObject = new welcomePage(driver);

        welcomePageObject.printNamesOfTheNavigation();
        welcomePageObject.isAllNavigationInTheWebsite();

        base.seleniumClose(driver);
    }
}
