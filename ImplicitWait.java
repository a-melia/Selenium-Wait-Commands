package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait {
    public static void main( String[] args ){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");

        WebElement buttonAdder = driver.findElement(By.id("adder"));
        buttonAdder.click();

        WebElement javaBox = driver.findElement(By.id("box0"));
        boolean isJavaBoxDisplayed = javaBox.isDisplayed();
        if (isJavaBoxDisplayed)
            System.out.println("box jest wyświetlony");
        else
            System.out.println("box nie jest wyświetlony");
    }

}
