package ru.training.addressbook.tests;

import org.testng.annotations.Test;
import ru.training.addressbook.model.GroupData;

/**
 * Created by ws03 on 7/28/2017.
 */
public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification(){
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("one", "two", "three"));
        app.getGroupHelper().submitGroupModification();
        app.getNavigationHelper().returnToGroupPage();




    }
}
