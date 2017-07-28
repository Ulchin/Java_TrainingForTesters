package ru.training.addressbook.tests;

import org.testng.annotations.Test;
import ru.training.addressbook.model.ContactData;


/**
 * Created by ws03 on 7/28/2017.
 */
public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        app.getNavigationHelper().gotoHome();
        app.getContactHelper().editContact();
        app.getContactHelper().fillCustomerData(new ContactData("", "Poligraphovich", "", "", ""));
        app.getContactHelper().updateCustomerData();
        app.getNavigationHelper().gotoHome();


    }
}
