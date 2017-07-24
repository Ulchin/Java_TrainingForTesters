package ru.training.addressbook.tests;

import org.testng.annotations.Test;
import ru.training.addressbook.model.ContactData;

public class NewContactCreationTests extends TestBase {

    @Test
    public void addNewContact() {

        app.getContactHelper().getBaseHelper().addNewUser();
        app.getContactHelper().getBaseHelper().fillUserInfo(new ContactData("Poligraf", "P", "Sharikov", "poligraf@poligraf.com", "+7666123456"));
        app.getContactHelper().getBaseHelper().saveNewUser();
        app.gotoHomePage();
    }



}
