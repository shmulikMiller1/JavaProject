package Automation_Project.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class seleniumBase {
    public static ChromeDriver seleniumInit(String url){

        System.out.println("Starting...");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");    //fix for chrome version 111
        options.addArguments("--start-maximized");
        options.setAcceptInsecureCerts(true);
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //using time unit
        driver.get(url);

        return driver;
    }

    public static void seleniumClose(ChromeDriver driver){
        System.out.println("closing test...");
        driver.close();
    }
}
