package ru.training.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by ws03 on 7/28/2017.
 */
public class ContactDeletionTests extends TestBase {

    @Test

    public void testContactDeletion() {

        app.getNavigationHelper().gotoHome();
        app.getContactHelper().selectCustomer();
        app.getContactHelper().deleteCustomer();
        app.getContactHelper().acceptDeletion();
        app.getNavigationHelper().gotoHome();
    }
}
