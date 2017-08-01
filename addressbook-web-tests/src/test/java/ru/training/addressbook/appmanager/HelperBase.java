package ru.training.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

/**
 * Created by ws03 on 7/28/2017.
 */
public class HelperBase {
    protected WebDriver wd; //declaration inside GroupHelper class

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    protected void type(By locator, String text) {
        if (text != null) {
            String existingText = wd.findElement(locator).getAttribute("value"); //only for input fields. in other case - getText
            if (!text.equals(existingText)) {
                wd.findElement(locator).click();
                wd.findElement(locator).clear();
                wd.findElement(locator).sendKeys(text);
            }
        }


    }

    protected void click(By locator) {
        wd.findElement(locator).click();
    }

    protected void entry(By locator, By xPath) {
        wd.findElement(locator).findElement(xPath).click();
    }

    protected void select(By locator) {
        wd.findElement(locator).isSelected();
    }


    protected void closePopup() {
        wd.switchTo().alert().accept();
    }


    public boolean isAlertPresent() {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    protected boolean isElementPresent(By locator) { //helps to switch between form with Group field and form without it.
        try {
            wd.findElement(locator);
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }
}
