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

    public void editContact() {
        click(By.xpath("//table[@id='maintable']/tbody/tr[3]/td[8]/a/img"));
    }

    public void updateCustomerData() {
        click(By.xpath("//div[@id='content']/form[1]/input[22]"));
    }

    public void selectCustomer() {
        select(By.xpath("//input[@id='1']"));
    }

    public void deleteCustomer() {
        click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
    }

    public  void acceptDeletion(){ closePopup();}

    //endregion
}
