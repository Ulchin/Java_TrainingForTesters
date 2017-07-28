package ru.training.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.training.addressbook.model.GroupData;

/**
 * Created by ws03 on 7/21/2017.
 */
public class GroupHelper extends HelperBase {


    public GroupHelper(WebDriver wd) {
        super(wd);
    }

    //region Group (methods)
    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void deleteGroup() {
        click(By.name("delete"));
    }

    public void submitGroupModification() {
        click(By.name("update"));
    }

    //endregion methods


}
