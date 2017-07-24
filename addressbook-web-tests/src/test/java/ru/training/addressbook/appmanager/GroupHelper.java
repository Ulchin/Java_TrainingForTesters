package ru.training.addressbook.appmanager;

import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by ws03 on 7/21/2017.
 */
public class GroupHelper {

    private BaseHelper baseHelper;
    private FirefoxDriver wd; //declaration inside GroupHelper class

    public GroupHelper(FirefoxDriver wd) {//constructor in GroupHelper initialize wd with local value, wd can be used now
        baseHelper = new BaseHelper(wd);
        this.wd = wd;
    }

    public BaseHelper getBaseHelper() {
        return baseHelper;
    }
}
