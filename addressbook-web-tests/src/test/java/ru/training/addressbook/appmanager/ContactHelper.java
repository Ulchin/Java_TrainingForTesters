package ru.training.addressbook.appmanager;

import org.openqa.selenium.firefox.FirefoxDriver;
import ru.training.addressbook.model.ContactData;

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
    public void addNewUser() {
        baseHelper.addNewCustomer();
    }

    public void fillUserInfo(ContactData contactData) {
        baseHelper.fillCustomerData(contactData);
    }

    public void saveNewUser() {
        baseHelper.saveCustomer();
    }

    public BaseHelper getBaseHelper() {
        return baseHelper;
    }
}
