package ru.dexsys;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/IdeaProjects/WebDriver/chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://vk.com/id46415342");
        webDriver.manage().window().maximize();

        WebElement login = webDriver.findElement(By.xpath("//*[@id=\"quick_email\"]"));
              login.sendKeys("");
              WebElement password = webDriver.findElement(By.xpath("//*[@id=\"quick_pass\"]"));
              password.sendKeys("");
              WebElement vhod = webDriver.findElement(By.xpath("//*[@id=\"quick_login_button\"]"));
              vhod.click();
              WebElement photo = webDriver.findElement(By.xpath("//*[@id=\"profile_photo_link\"]/img"));
              photo.click();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
              WebElement messages = webDriver.findElement(By.xpath("//*[@id=\"reply_field46415342_photo457245330\"]"));
              messages.click();
              messages.sendKeys("Ы");
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
              WebElement otpravit = webDriver.findElement(By.xpath("//*[@id=\"reply_button46415342_photo457245330\"]"));
              otpravit.click();


//        @Test
//        public void lT() {
//            login.sendKeys("");
//            vhod.click();
//            photo.click();
//            messages.click();
//            messages.sendKeys("Ы");
//            otpravit.click();
//            webDriver.quit();
//        }

//       WebElement element = webDriver.findElement(elementLocator);
//       element.click();

        System.out.println("This tittle -> " + webDriver.getTitle());

    }
}
