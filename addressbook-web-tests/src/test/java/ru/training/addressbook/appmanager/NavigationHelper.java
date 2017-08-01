package ru.training.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by ws03 on 7/24/2017.
 */
public class NavigationHelper extends HelperBase {


    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    //region Navigation (methods)

    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }


    public void gotoGroupPage() { //checking conditions instead of implicitlyWait. Use combination of criteria
        if (isElementPresent(By.tagName("h1"))
                && wd.findElement(By.tagName("h1")).getText().equals("Groups")
                && isElementPresent(By.name("new"))) {
            return;
        }
        click(By.linkText("groups"));
    }

    public void gotoHomePage() {
        click(By.linkText("home page"));
    }

    public void gotoHome() {
        if (isElementPresent(By.id("maintable"))) { //checking conditions instead of implicitlyWait
            return;
        }
        click(By.linkText("home"));
    }
    //endregion

}
