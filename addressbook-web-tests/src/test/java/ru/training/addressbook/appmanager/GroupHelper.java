package ru.training.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.training.addressbook.model.GroupData;

/**
 * Created by ws03 on 7/21/2017.
 */
public class GroupHelper extends HelperBase {


    public GroupHelper(FirefoxDriver wd) {
        super(wd);
    }

    //region Group
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

    //endregion


}
