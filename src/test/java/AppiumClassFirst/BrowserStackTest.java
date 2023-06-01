package AppiumClassFirst;

import java.net.URL;
import java.util.List;
import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;


public class BrowserStackTest {

   // curl -u "hasankoc_ojuh21:4U7fShh7cfrR2Kn4qL9R" -X POST "https://api-cloud.browserstack.com/app-automate/upload"  -F "file=@C:\Users\1\Desktop\appiumNew\src\test\java\AppiumClassFirst\APP\Duolingo.apk"



    public static String userName = "hasankoc_ojuh21";
    public static String accessKey = "4U7fShh7cfrR2Kn4qL9R";

    public static void main(String args[]) throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("device", "Samsung Galaxy S8 Plus");
        caps.setCapability("os_version", "7.0");
        caps.setCapability("project", "My First Project");
        caps.setCapability("build", "My First Build");
        caps.setCapability("name", "Browserstack");
        caps.setCapability("app", "bs://910f286d6bc56b16fd3837c8a43aaf3e6a1d2634");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);


        // The driver.quit statement is required, otherwise the test continues to execute, leading to a timeout.
        driver.quit();
    }
}

