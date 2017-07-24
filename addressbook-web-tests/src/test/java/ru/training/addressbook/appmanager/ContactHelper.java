package ru.training.addressbook.appmanager;

import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by ws03 on 7/24/2017.
 */
public class ContactHelper {

    private BaseHelper baseHelper;
    private FirefoxDriver wd;

    public ContactHelper(FirefoxDriver wd) {
        baseHelper = new BaseHelper(wd);
        this.wd = wd;
    }


    public BaseHelper getBaseHelper() {
        return baseHelper;
    }
}
