package ru.training.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by ws03 on 7/24/2017.
 */
public class NavigationHelper extends HelperBase{


    public NavigationHelper(WebDriver wd) {
     super(wd);
    }

    //region Navigation (methods)

    public void returnToGroupPage() {
       click(By.linkText("group page"));
    }


    public void gotoGroupPage() {
        click(By.linkText("groups"));
    }

    public void gotoHomePage() {
        click(By.linkText("home page"));
    }

    public void gotoHome(){
        click(By.linkText("home"));
    }
    //endregion

}
