package ru.training.addressbook.appmanager;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

/**
 * Created by ws03 on 7/20/2017.
 */
public class ApplicationManager {

    FirefoxDriver wd;

    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper; //declaration on the class level
    private ContactHelper contactHelper;


    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void init() {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true).setBinary("C:/Program Files/Mozilla Firefox/firefox.exe"));
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost:8080/addressbook/group.php");
        groupHelper = new GroupHelper(wd); // new object initialization for using in Helper
        navigationHelper = new NavigationHelper(wd); //new obj init for using in Helper
        sessionHelper = new SessionHelper(wd); //new obj init for using in Helper
        contactHelper = new ContactHelper(wd); //new obj init for using in Helper
        sessionHelper.login("admin", "secret");
    }


    public void stop() {
        wd.quit();
    }


    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }

    public void gotoGroupPage() {
        navigationHelper.gotoGroupPage();
    }

    public void gotoHomePage() {
        navigationHelper.gotoHomePage();
    }

}

