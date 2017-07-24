package ru.training.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by ws03 on 7/24/2017.
 */
public class NavigationHelper {

    private FirefoxDriver wd;

    public NavigationHelper(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void gotoGroupPage() {
        wd.findElement(By.linkText("groups")).click();
    }

    public void gotoHomePage() {
        wd.findElement(By.linkText("home page")).click();
    }
}
