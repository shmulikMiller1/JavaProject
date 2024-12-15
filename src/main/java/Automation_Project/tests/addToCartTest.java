package Automation_Project.tests;

import Automation_Project.pages.product1Page;
import Automation_Project.pages.storePage;
import Automation_Project.pages.welcomePage;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;


public class addToCartTest {
    public static void main(String[] args) throws InterruptedException {
        seleniumBase base = new seleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.jpost.com/");

        welcomePage welcomePageObject = new welcomePage(driver);
        storePage storePageObject = new storePage(driver);
        product1Page product1PageObject = new product1Page(driver);

        welcomePageObject.clickOnStoreTab();
        String priceFromItem1 = storePageObject.getPriceOfFirstItem();
        storePageObject.clickOnFirstItem();
        String sumOfCart = product1PageObject.getSumOfCart();
        Assert.assertEquals("the test is failed.. because the price from item1 is " + priceFromItem1 + " but the sum in the cart is " + sumOfCart, priceFromItem1, sumOfCart);
        System.out.println("the test is passed!! the price from item1 is added to the cart sum...");

        base.seleniumClose(driver);
    }
}

