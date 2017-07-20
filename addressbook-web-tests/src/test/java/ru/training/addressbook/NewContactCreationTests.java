package ru.training.addressbook;

import org.testng.annotations.Test;

public class NewContactCreationTests extends TestBase {

    @Test
    public void addNewContact() {

        addNewUser();
        fillUserInfo(new ContactData("Poligraf", "P", "Sharikov", "poligraf@poligraf.com", "+7666123456"));
        saveNewUser();
        gotoHomePage();
    }



}
