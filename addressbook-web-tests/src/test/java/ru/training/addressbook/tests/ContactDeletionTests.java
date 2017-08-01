package ru.training.addressbook.tests;

import org.testng.annotations.Test;
import ru.training.addressbook.model.ContactData;

/**
 * Created by ws03 on 7/28/2017.
 */
public class ContactDeletionTests extends TestBase {

    @Test

    public void testContactDeletion() {

        app.getNavigationHelper().gotoHome();
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("Poligraf", "P", "Sharikov", "poligraf@poligraf.com", "+7666123456", "[none]"), true);
        }
        app.getContactHelper().selectCustomer();
        app.getContactHelper().deleteCustomer();
        app.getContactHelper().acceptDeletion();
        app.getNavigationHelper().gotoHome();
    }
}
