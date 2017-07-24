package ru.training.addressbook.tests;

import org.testng.annotations.Test;
import ru.training.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {

        app.getNavigationHelper().getBaseHelper().gotoGroupPage();
        app.getGroupHelper().getBaseHelper().initGroupCreation();
        app.getGroupHelper().getBaseHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
        app.getGroupHelper().getBaseHelper().submitGroupCreation();
        app.getGroupHelper().getBaseHelper().returnToGroupPage();
    }

}
