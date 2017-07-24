package ru.training.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.training.addressbook.model.ContactData;

/**
 * Created by ws03 on 7/24/2017.
 */
public class ContactHelper {

    private FirefoxDriver wd;

    public ContactHelper(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void addNewUser() {
        wd.findElement(By.linkText("add new")).click();
    }

    public void fillUserInfo(ContactData contactData) {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys(contactData.getName());
        wd.findElement(By.name("middlename")).click();
        wd.findElement(By.name("middlename")).clear();
        wd.findElement(By.name("middlename")).sendKeys(contactData.getMidname());
        wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys(contactData.getLastname());
        wd.findElement(By.name("email")).click();
        wd.findElement(By.name("email")).clear();
        wd.findElement(By.name("email")).sendKeys(contactData.getEmail());
        wd.findElement(By.name("mobile")).click();
        wd.findElement(By.name("mobile")).clear();
        wd.findElement(By.name("mobile")).sendKeys(contactData.getMobile());
    }

    public void saveNewUser() {
        wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    }


}
