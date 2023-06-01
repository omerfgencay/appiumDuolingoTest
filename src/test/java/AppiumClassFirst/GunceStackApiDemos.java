package AppiumClassFirst;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class GunceStackApiDemos {

   // curl -u "hasankoc_ojuh21:4U7fShh7cfrR2Kn4qL9R" -X POST "https://api-cloud.browserstack.com/app-automate/upload"  -F "file=@C:\Users\1\Desktop\appiumNew\src\test\java\AppiumClassFirst\APP\apidemos.apk"



    public static String userName = "hasankoc_ojuh21";
    public static String accessKey = "4U7fShh7cfrR2Kn4qL9R";

    public static void main(String args[]) throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();

// Use Java Client v6.0.0 or above
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("platformVersion", "10.0");
        capabilities.setCapability("deviceName", "Samsung Galaxy Note 20");
        capabilities.setCapability("app", "bs://1583109ae5e566c07750bef2284d7fc9de43eedb");



        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), capabilities);


        // The driver.quit statement is required, otherwise the test continues to execute, leading to a timeout.
        driver.quit();
    }
}

