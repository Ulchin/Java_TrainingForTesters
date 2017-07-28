package ru.training.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by ws03 on 7/24/2017.
 */
public class SessionHelper extends HelperBase {


    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void login(String username, String password) {
        type(By.name("user"), username);
        type(By.name("pass"), password);
        click(By.xpath("//form[@id='LoginForm']/input[3]"));
    }
}
