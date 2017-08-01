package ru.training.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.training.addressbook.model.ContactData;

/**
 * Created by ws03 on 7/24/2017.
 */
public class ContactHelper extends HelperBase {

    private NavigationHelper navigationHelper;

    public ContactHelper(WebDriver wd) {
        super(wd);
        navigationHelper = new NavigationHelper(wd);
    }

    //region Contact (methods)

    public void addNewCustomer() {
        click(By.linkText("add new"));
    }

    public void fillCustomerData(ContactData contactData, boolean creation) { //creation is param for status: if true=creation, if false=modification
        type(By.name("firstname"), contactData.getName());
        type(By.name("middlename"), contactData.getMidname());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("email"), contactData.getEmail());
        type(By.name("mobile"), contactData.getMobile());

       if (creation) { //assert for checking if element Group exists
            new Select(wd.findElement(By.name("new_group"))).selectByValue(contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
    }


    public void saveCustomer() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void editContact() {
        entry(By.name("entry"),(By.xpath("./td[8]/a/img")));
    }

    public void updateCustomerData() {
        click(By.xpath("//div[@id='content']/form[1]/input[22]"));
    }

    public void selectCustomer() {
        select(By.name("selected[]"));
    }

    public void deleteCustomer() {
        click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
    }

    public void acceptDeletion() {
        closePopup();
    }

    public boolean isThereAContact() {
        return isElementPresent(By.name("selected[]"));
    }

    public void createContact(ContactData contactData, boolean b) {
        addNewCustomer();
        fillCustomerData(new ContactData("Poligraf", "P", "Sharikov", "poligraf@poligraf.com", "+7666123456", null), true);
        saveCustomer();
        navigationHelper.gotoHomePage();
    }


    //endregion
}
