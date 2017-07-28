package ru.training.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by ws03 on 7/28/2017.
 */
public class GroupDeletionTests extends TestBase{

    @Test

    public void testGroupDeletion(){

        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteGroup();
        app.getNavigationHelper().gotoGroupPage();

    }

}
