package ru.training.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.training.addressbook.model.ContactData;

/**
 * Created by ws03 on 7/24/2017.
 */
public class ContactHelper extends HelperBase {

    public ContactHelper(FirefoxDriver wd)  {
     super(wd);
    }

    //region Contact (methods)

    public void addNewCustomer() {
        click(By.linkText("add new"));
    }

    public void fillCustomerData(ContactData contactData) {
        type(By.name("firstname"),contactData.getName());
        type(By.name("middlename"),contactData.getMidname());
        type(By.name("lastname"),contactData.getLastname());
        type(By.name("email"),contactData.getEmail());
        type(By.name("mobile"),contactData.getMobile());
    }

    public void saveCustomer() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }
    //endregion
}
