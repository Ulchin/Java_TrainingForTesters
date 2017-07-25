package ru.training.addressbook.appmanager;

import org.openqa.selenium.firefox.FirefoxDriver;
import ru.training.addressbook.model.GroupData;

/**
 * Created by ws03 on 7/21/2017.
 */
public class GroupHelper {

    private BaseHelper baseHelper;
    private FirefoxDriver wd; //declaration inside GroupHelper class

    public GroupHelper(FirefoxDriver wd) {//constructor in GroupHelper initialize wd with local value, wd can be used now
        baseHelper = new BaseHelper(wd);
        this.wd = wd;
    }

    public void submitGroupCreation() {
        baseHelper.createGroup();
    }


    public void fillGroupForm(GroupData groupData) {
        baseHelper.fillGroupData(groupData);
    }


    public void initGroupCreation() {
        baseHelper.initNewGroup();
    }


    public BaseHelper getBaseHelper() {
        return baseHelper;
    }
}
